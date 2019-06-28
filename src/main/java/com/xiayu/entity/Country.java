package com.xiayu.entity;

import com.xiayu.common.BaseEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "t_country")
public class Country extends BaseEntity {
    @Id
    @Column
    private String id;
    @Column
    private String countryName;
    @OneToMany(mappedBy = "country",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Province> provinces;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
