package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class CreditToIncomeRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // df['CREDIT_TO_INCOME_RATIO'] = df['AMT_CREDIT'] / df['AMT_INCOME_TOTAL']

        Double AMT_CREDIT = GetValueFromMap.getDouble(map, "AMT_CREDIT");
        Double AMT_INCOME_TOTAL = GetValueFromMap.getDouble(map, "AMT_INCOME_TOTAL");
        if (AMT_CREDIT == null || AMT_INCOME_TOTAL == null){
            map.put("CREDIT_TO_INCOME_RATIO", null);
        }else {
            map.put("CREDIT_TO_INCOME_RATIO", AMT_CREDIT/AMT_INCOME_TOTAL);
        }

    }
}
