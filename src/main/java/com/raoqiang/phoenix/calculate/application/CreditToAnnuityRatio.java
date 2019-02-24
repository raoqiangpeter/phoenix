package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class CreditToAnnuityRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // df['CREDIT_TO_ANNUITY_RATIO'] = df['AMT_CREDIT'] / df['AMT_ANNUITY']

        Double AMT_CREDIT = GetValueFromMap.getDouble(map, "AMT_CREDIT");
        Double AMT_ANNUITY = GetValueFromMap.getDouble(map, "AMT_ANNUITY");
        if (AMT_CREDIT == null || AMT_ANNUITY == null){
            map.put("CREDIT_TO_ANNUITY_RATIO", null);
        }else {
            map.put("CREDIT_TO_ANNUITY_RATIO", AMT_CREDIT/AMT_ANNUITY);
        }

    }
}
