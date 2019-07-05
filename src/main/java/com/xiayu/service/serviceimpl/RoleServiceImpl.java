package com.xiayu.service.serviceimpl;

import com.xiayu.entity.Role;
import com.xiayu.repository.RoleRepository;
import com.xiayu.service.RoleService;
import com.xiayu.vo.RoleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

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
    public List<RoleVO> getRoleList() {
        List<Role> roles = roleRepository.findByDelflagIsFalse();
        List<RoleVO> roleResponses = new ArrayList<>();
        roles.stream().forEach(role -> {
            RoleVO roleVO = new RoleVO();
            roleVO.setId(role.getId());
            roleVO.setRoleName(role.getRoleName());
            roleVO.setCreateTime(role.getCreateTime());
            roleVO.setUpdateId(role.getUpdateId());
            roleVO.setUpdateTime(role.getUpdateTime());
            roleResponses.add(roleVO);
        });
        return roleResponses;
    }

    @Override
    public RoleVO getRole() {
        return null;
    }

    @Override
    public boolean addRole() {

        return false;
    }

    @Override
    public boolean deleteRole() {
        return false;
    }
}
