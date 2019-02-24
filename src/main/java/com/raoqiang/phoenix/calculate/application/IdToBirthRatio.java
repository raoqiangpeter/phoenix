package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class IdToBirthRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // df['ID_TO_BIRTH_RATIO'] = df['DAYS_ID_PUBLISH'] / df['DAYS_BIRTH']
        Double DAYS_ID_PUBLISH = GetValueFromMap.getDouble(map, "DAYS_ID_PUBLISH");
        Double DAYS_BIRTH = GetValueFromMap.getDouble(map, "DAYS_BIRTH");
        if (DAYS_ID_PUBLISH == null || DAYS_BIRTH == null){
            map.put("ID_TO_BIRTH_RATIO", null);
        }else {
            map.put("ID_TO_BIRTH_RATIO", DAYS_ID_PUBLISH/DAYS_BIRTH);
        }
    }
}
