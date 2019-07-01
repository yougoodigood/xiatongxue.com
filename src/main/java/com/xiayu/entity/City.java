package com.xiayu.entity;

import com.xiayu.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_city")
@Setter
@Getter
public class City extends BaseEntity implements Serializable {
    @Id
    @Column
    private String id;
    @Column
    private String cityName;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, optional = false)
    @JoinColumn(name = "province_id")
    private Province province;
}
