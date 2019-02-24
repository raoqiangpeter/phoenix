package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class NameTypeSuite implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // NAME_TYPE_SUITE
        String tmp = GetValueFromMap.getString(map, "NAME_TYPE_SUITE");
        if (tmp == null){
            map.put("NAME_TYPE_SUITE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.NAME_TYPE_SUITE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("NAME_TYPE_SUITE", null);
            }else {
                map.put("NAME_TYPE_SUITE", index);
            }
        }
    }
}
