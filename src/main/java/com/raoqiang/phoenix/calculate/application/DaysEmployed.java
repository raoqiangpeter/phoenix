package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class DaysEmployed implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        if (map==null){
            return;
        }
        if (map.get("DAYS_EMPLOYED")==null || map.get("DAYS_EMPLOYED").equals("")){
            map.put("DAYS_EMPLOYED", 365243);

        }
    }
}
