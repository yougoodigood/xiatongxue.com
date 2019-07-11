package com.xiayu.module.user.service.serviceimpl;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.permission.entity.Permission;
import com.xiayu.module.permission.entity.Role;
import com.xiayu.module.permission.repository.RoleRepository;
import com.xiayu.module.user.service.RoleService;
import com.xiayu.module.user.vo.PermissionVO;
import com.xiayu.module.user.vo.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Predicate;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @Classname RoleServiceImpl
 * @Description
 * @Author hello
 * @Date 2019/7/3 11:59
 * @Version 1.0
 **/
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public PaginationVO getRoleList(PaginationVO paginationVO) {
        Pageable pageable = new PageRequest(paginationVO.getCurrentPageNum() - 1, paginationVO.getPerPageNum());
        Specification<Role> specification = (root, query, cb) -> {
            List<Predicate> ps = new ArrayList<>();
            ps.add(cb.equal(root.<Boolean>get("delflag"), false));
            return cb.and(ps.toArray(new Predicate[ps.size()]));
        };
        Page<Role> rolePage = roleRepository.findAll(specification, pageable);
        List<RoleVO> roleVOS = new ArrayList<>();
        rolePage.getContent().stream().forEach(role -> {
            RoleVO roleVO = new RoleVO();
            roleVO.setRoleName(role.getRoleName());
            roleVO.generalElementMapper(role);
            roleVOS.add(roleVO);
        });
        paginationVO.setTotalPage(rolePage.getTotalPages());
        paginationVO.setPageData(roleVOS);
        return paginationVO;
    }

    @Override
    public RoleVO getRole(RoleVO roleVO) {
        Optional<Role> role = roleRepository.findById(roleVO.getId());
        role.ifPresent(role1 -> {
            roleVO.setRoleName(role1.getRoleName());
            List<PermissionVO> permissionVOS = new ArrayList<>();
            roleVO.setPermissions(permissionVOS);
            roleVO.generalElementMapper(role1);
        });
        return roleVO;
    }

    @Override
    public boolean addRole(RoleVO roleVO) {
        Role role = new Role();
        role.setRoleName(roleVO.getRoleName());
        List<Permission> permissions = new ArrayList<>();
        List<PermissionVO> permissionVOS = roleVO.getPermissions();
        permissionVOS.forEach(permissionVO -> {
            Permission permission = new Permission();
            permission.setId(permissionVO.getId());
            permissions.add(permission);
        });
        role.setCreateId(roleVO.getCreateId());
        roleRepository.save(role);
        return true;
    }

    @Override
    public boolean deleteRole(RoleVO roleVO) {
        Optional<Role> role = roleRepository.findById(roleVO.getId());
        role.ifPresent(roleTemp ->{
            roleTemp.setDelflag(true);
            roleRepository.save(roleTemp);
        });
        return true;
    }

    @Override
    public boolean updateRole(RoleVO roleVO) {
        Optional<Role> role = roleRepository.findById(roleVO.getId());
        role.ifPresent(roleTemp -> {
            roleTemp.setRoleName(roleVO.getRoleName());
            roleRepository.save(roleTemp);
        });
        return true;
    }
}
