package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class CodeGender implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        String tmp = GetValueFromMap.getString(map, "CODE_GENDER");
        if (tmp == null){
            map.put("CODE_GENDER", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.CODE_GENDER_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("CODE_GENDER", null);
            }else {
                map.put("CODE_GENDER", index);
            }
        }
    }
}
