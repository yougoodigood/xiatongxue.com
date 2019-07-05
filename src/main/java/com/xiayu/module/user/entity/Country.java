package com.xiayu.module.user.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "t_country")
@Setter
@Getter
public class Country extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 6668907618232204866L;
    @Column
    private String countryName;
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Province> provinces;
}
