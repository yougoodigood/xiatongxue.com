package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class ProvinceVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = -6148495682818950978L;

    private String provinceName;
    private CountryVO countryVO;
    private List<CityVO> cityVOS;
}
