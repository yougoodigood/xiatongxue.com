package com.xiayu.module.user.service.serviceimpl;

import com.xiayu.common.vo.PaginationVO;
import com.xiayu.module.permission.entity.Permission;
import com.xiayu.enumeration.ResourceTypeEnum;
import com.xiayu.module.permission.repository.PermissionRepository;
import com.xiayu.module.user.service.PermissionService;
import com.xiayu.module.user.vo.PermissionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.Predicate;

/**
 * @Classname PermissionServiceImpl
 * @Description
 * @Author hello
 * @Date 2019/7/4 13:14
 * @Version 1.0
 **/
@Service
@Transactional
public class PermissionServiceImpl implements PermissionService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public PaginationVO getPermissionList(PaginationVO paginationVO) throws Exception{
        Pageable pageable = new PageRequest(paginationVO.getCurrentPageNum() - 1, paginationVO.getPerPageNum());
        Specification<Permission> specification = (root, query, cb) -> {
            List<Predicate> ps = new ArrayList<>();
            ps.add(cb.equal(root.<Boolean>get("delflag"), false));
            return cb.and(ps.toArray(new Predicate[ps.size()]));
        };
        Page<Permission> permissionPage = permissionRepository.findAll(specification, pageable);
        List<PermissionVO> permissionVOS = new ArrayList<>();
        permissionPage.getContent().stream().forEach(permission -> {
            PermissionVO permissionVO = new PermissionVO();
            permissionVO.setUrl(permission.getUrl());
            permissionVO.setPermissionName(permission.getPermissionName());
            permissionVO.setResourceType(permission.getResourceType().toString());
            permissionVO.generalElementMapper(permission);
            permissionVOS.add(permissionVO);
        });
        paginationVO.setTotalPage(permissionPage.getTotalPages());
        paginationVO.setPageData(permissionVOS);
        return paginationVO;
    }

    public boolean addPermission(PermissionVO permissionVO) throws Exception{
        Permission permission = new Permission();
        permission.setPermissionName(permissionVO.getPermissionName());
        permission.setResourceType(ResourceTypeEnum.valueOf(permissionVO.getResourceType()));
        permission.setUrl(permissionVO.getUrl());
        permission.setCreateId("1");
        permissionRepository.save(permission);
        return true;
    }

    public PermissionVO getPermissionById(PermissionVO permissionVO) throws Exception{
        Permission permission = permissionRepository.findById(permissionVO.getId()).get();
        permissionVO.setUrl(permission.getUrl());
        permissionVO.setPermissionName(permission.getPermissionName());
        permissionVO.setResourceType(permission.getResourceType().toString());
        permissionVO.generalElementMapper(permission);
        return permissionVO;
    }

    public boolean deletePermission(PermissionVO permissionVO) throws Exception{
        Permission permission = permissionRepository.findById(permissionVO.getId()).get();
        permission.setDelflag(true);
        permissionRepository.save(permission);
        return true;
    }

    public boolean updatePermission(PermissionVO permissionVO) throws Exception{
        Permission permission;
        try {
            permission = permissionRepository.findById(permissionVO.getId()).get();
        }catch (Exception e){
            logger.error("updatePermission:" + e);
            throw new RuntimeException("请求ID错误");
        }
        permission.setResourceType(ResourceTypeEnum.valueOf(permissionVO.getResourceType()));
        permission.setPermissionName(permissionVO.getPermissionName());
        permission.setUrl(permissionVO.getUrl());
        permission.setUpdateId("1");
        permissionRepository.save(permission);
        return true;
    }
}
