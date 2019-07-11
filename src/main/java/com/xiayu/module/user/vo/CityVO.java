package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;

@Data
public class CityVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = 8480557837495107149L;

    private String cityName;
    private ProvinceVO province;
}
