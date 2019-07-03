package com.xiayu.service;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.xiayu.common.response.RoleResponse;
import com.xiayu.entity.Role;
import com.xiayu.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<RoleResponse> getRoleList() {
        List<Role> roles = roleRepository.findByDelflagIsFalse();
        List<RoleResponse> roleResponses = new ArrayList<>();
        roles.stream().forEach(role -> {
            RoleResponse roleResponse = new RoleResponse();
            roleResponse.setId(role.getId());
            roleResponse.setRoleName(role.getRoleName());
            roleResponse.setCreateTime(role.getCreateTime());
            roleResponse.setUpdateId(role.getUpdateId());
            roleResponse.setUpdateTime(role.getUpdateTime());
            roleResponses.add(roleResponse);
        });
        return roleResponses;
    }

    @Override
    public RoleResponse getRole() {
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
