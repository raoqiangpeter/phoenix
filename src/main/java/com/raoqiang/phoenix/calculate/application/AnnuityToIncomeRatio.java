package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class AnnuityToIncomeRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        //df['ANNUITY_TO_INCOME_RATIO'] = df['AMT_ANNUITY'] / df['AMT_INCOME_TOTAL']

        Double AMT_ANNUITY = GetValueFromMap.getDouble(map, "AMT_ANNUITY");
        Double AMT_INCOME_TOTAL = GetValueFromMap.getDouble(map, "AMT_INCOME_TOTAL");
        if (AMT_ANNUITY == null || AMT_INCOME_TOTAL == null){
            map.put("ANNUITY_TO_INCOME_RATIO", null);
        }else {
            map.put("ANNUITY_TO_INCOME_RATIO", AMT_ANNUITY/AMT_INCOME_TOTAL);
        }

    }
}
