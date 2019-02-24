package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class NameHousingType implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // NAME_HOUSING_TYPE
        String tmp = GetValueFromMap.getString(map, "NAME_HOUSING_TYPE");
        if (tmp == null){
            map.put("NAME_HOUSING_TYPE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.NAME_HOUSING_TYPE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("NAME_HOUSING_TYPE", null);
            }else {
                map.put("NAME_HOUSING_TYPE", index);
            }
        }
    }
}
