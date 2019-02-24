package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class FondkapremontMode implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        String tmp = GetValueFromMap.getString(map, "FONDKAPREMONT_MODE");
        if (tmp == null){
            map.put("FONDKAPREMONT_MODE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.FONDKAPREMONT_MODE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("FONDKAPREMONT_MODE", null);
            }else {
                map.put("FONDKAPREMONT_MODE", index);
            }
        }
    }
}
