package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class IncomeToEmployedRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
//        df['INCOME_TO_EMPLOYED_RATIO'] = df['AMT_INCOME_TOTAL'] / df['DAYS_EMPLOYED']

        Double AMT_INCOME_TOTAL = GetValueFromMap.getDouble(map, "AMT_INCOME_TOTAL");
        Double DAYS_EMPLOYED = GetValueFromMap.getDouble(map, "DAYS_EMPLOYED");
        if (AMT_INCOME_TOTAL == null || DAYS_EMPLOYED == null){
            map.put("INCOME_TO_EMPLOYED_RATIO", null);
        }else {
            map.put("INCOME_TO_EMPLOYED_RATIO", AMT_INCOME_TOTAL/DAYS_EMPLOYED);
        }

    }
}
