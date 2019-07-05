package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import com.xiayu.enumeration.ResourceTypeEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "t_permission")
public class Permission extends BaseEntity implements Serializable {
    @Column
    private String permissionName;
    @Column
    private String url;
    @Column
    private ResourceTypeEnum resourceType;

    @ManyToMany(mappedBy = "permissions")
    private List<Role> roles;
}
