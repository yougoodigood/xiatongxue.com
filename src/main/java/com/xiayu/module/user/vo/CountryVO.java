package com.xiayu.module.user.vo;

import com.xiayu.common.vo.BaseVO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CountryVO extends BaseVO implements Serializable {
    private static final long serialVersionUID = 6668907618232204866L;
    private String countryName;
    private List<ProvinceVO> provinces;
}
