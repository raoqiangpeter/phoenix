package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class CreditToGoodsRatio implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // df['CREDIT_TO_GOODS_RATIO'] = df['AMT_CREDIT'] / df['AMT_GOODS_PRICE']
        Double AMT_CREDIT = GetValueFromMap.getDouble(map, "AMT_CREDIT");
        Double AMT_GOODS_PRICE = GetValueFromMap.getDouble(map, "AMT_GOODS_PRICE");
        if (AMT_CREDIT == null || AMT_GOODS_PRICE == null){
            map.put("CREDIT_TO_GOODS_RATIO", null);
        }else {
            map.put("CREDIT_TO_GOODS_RATIO", AMT_CREDIT/AMT_GOODS_PRICE);
        }
    }
}
