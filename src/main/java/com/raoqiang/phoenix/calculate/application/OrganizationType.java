package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class OrganizationType implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // ORGANIZATION_TYPE
        String tmp = GetValueFromMap.getString(map, "ORGANIZATION_TYPE");
        if (tmp == null){
            map.put("ORGANIZATION_TYPE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.ORGANIZATION_TYPE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("ORGANIZATION_TYPE", null);
            }else {
                map.put("ORGANIZATION_TYPE", index);
            }
        }
    }
}
