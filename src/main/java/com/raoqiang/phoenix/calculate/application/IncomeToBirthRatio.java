package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class IncomeToBirthRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
//        df['INCOME_TO_BIRTH_RATIO'] = df['AMT_INCOME_TOTAL'] / df['DAYS_BIRTH']

        Double AMT_INCOME_TOTAL = GetValueFromMap.getDouble(map, "AMT_INCOME_TOTAL");
        Double DAYS_BIRTH = GetValueFromMap.getDouble(map, "DAYS_BIRTH");
        if (AMT_INCOME_TOTAL == null || DAYS_BIRTH == null){
            map.put("INCOME_TO_BIRTH_RATIO", null);
        }else {
            map.put("INCOME_TO_BIRTH_RATIO", AMT_INCOME_TOTAL/DAYS_BIRTH);
        }

    }
}
