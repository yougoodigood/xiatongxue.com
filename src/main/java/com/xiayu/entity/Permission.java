package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_permission")
public class Permission extends BaseEntity {
    @Id
    @Column
    private String id;
    @Column
    private String permissionName;
    @Column
    private String url;
    @Column
    private String resourceType;

    @ManyToMany(mappedBy = "permissions")
    private List<Role> roles;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
