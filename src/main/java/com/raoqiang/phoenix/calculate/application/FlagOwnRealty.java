package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class FlagOwnRealty implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        String tmp = GetValueFromMap.getString(map, "FLAG_OWN_REALTY");
        if (tmp == null){
            map.put("FLAG_OWN_REALTY", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.FLAG_OWN_REALTY_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("FLAG_OWN_REALTY", null);
            }else {
                map.put("FLAG_OWN_REALTY", index);
            }
        }
    }
}
