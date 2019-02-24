package com.raoqiang.phoenix.calculate.bureau;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class CreditDuration implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // bureau['CREDIT_DURATION'] = -bureau['DAYS_CREDIT'] + bureau['DAYS_CREDIT_ENDDATE']

        Double DAYS_CREDIT = GetValueFromMap.getDouble(map, "DAYS_CREDIT");
        Double DAYS_CREDIT_ENDDATE = GetValueFromMap.getDouble(map, "DAYS_CREDIT_ENDDATE");
        if (DAYS_CREDIT == null || DAYS_CREDIT_ENDDATE == null){
            map.put("CREDIT_DURATION", null);
        }else {
            map.put("CREDIT_DURATION", -DAYS_CREDIT + DAYS_CREDIT_ENDDATE);
        }

    }
}
