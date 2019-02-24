package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class HousetypeMode implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // HOUSETYPE_MODE
        String tmp = GetValueFromMap.getString(map, "HOUSETYPE_MODE");
        if (tmp == null){
            map.put("HOUSETYPE_MODE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.HOUSETYPE_MODE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("HOUSETYPE_MODE", null);
            }else {
                map.put("HOUSETYPE_MODE", index);
            }
        }
    }
}
