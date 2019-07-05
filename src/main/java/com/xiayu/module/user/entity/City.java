package com.xiayu.module.user.entity;

import com.xiayu.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_city")
@Setter
@Getter
public class City extends BaseEntity implements Serializable {
    @Column
    private String cityName;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "province_id")
    private Province province;
}
