package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class NameFamilyStatus implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // NAME_FAMILY_STATUS
        String tmp = GetValueFromMap.getString(map, "NAME_FAMILY_STATUS");
        if (tmp == null){
            map.put("NAME_FAMILY_STATUS", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.NAME_FAMILY_STATUS_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("NAME_FAMILY_STATUS", null);
            }else {
                map.put("NAME_FAMILY_STATUS", index);
            }
        }
    }
}
