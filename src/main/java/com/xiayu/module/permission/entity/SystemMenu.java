package com.xiayu.module.permission.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * @Classname SystemMenu
 * @Description
 * @Author hello
 * @Date 2019/7/11 11:56
 * @Version 1.0
 **/

@Setter
@Getter
@Entity
@Table(name = "t_system_menu")
public class SystemMenu extends BaseEntity {

    @Column
    private String menuName;
    @Column
    private String parentId;
    @Column
    private String navigateUrl;
    @Column
    private String menuCssId;
    @Column
    private int orderSeq;

    @OneToMany(mappedBy = "systemMenus", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Permission> permissions;

    @ManyToMany(mappedBy = "systemMenu")
    private List<Role> roles;
}
