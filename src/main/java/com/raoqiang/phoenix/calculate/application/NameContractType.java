package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class NameContractType implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // NAME_CONTRACT_TYPE
        String tmp = GetValueFromMap.getString(map, "NAME_CONTRACT_TYPE");
        if (tmp == null){
            map.put("NAME_CONTRACT_TYPE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.NAME_CONTRACT_TYPE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("NAME_CONTRACT_TYPE", null);
            }else {
                map.put("NAME_CONTRACT_TYPE", index);
            }
        }
    }
}
