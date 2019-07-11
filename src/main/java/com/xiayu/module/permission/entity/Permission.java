package com.xiayu.module.permission.entity;

import com.xiayu.common.entity.BaseEntity;
import com.xiayu.enumeration.ResourceTypeEnum;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.io.Serializable;


@Setter
@Getter
@Entity
@Table(name = "t_permission")
public class Permission extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 5543788854321691866L;

    @Column
    private String permissionName;
    @Column
    private String url;
    @Column
    private ResourceTypeEnum resourceType;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "system_menu_id")
    private SystemMenu systemMenus;
}
