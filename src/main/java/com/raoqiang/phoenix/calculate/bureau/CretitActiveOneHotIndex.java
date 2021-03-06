package com.raoqiang.phoenix.calculate.bureau;

import com.raoqiang.phoenix.calculate.constant.BureauOneHotIndex;
import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class CretitActiveOneHotIndex implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        String CREDIT_ACTIVE = GetValueFromMap.getString(map, "CREDIT_ACTIVE");

        for (String s: BureauOneHotIndex.CREDIT_ACTIVE_ONE_HOT_INDEX){
            if(s.substring(s.lastIndexOf("_")+1).equals(""+CREDIT_ACTIVE)){
                map.put(s, 1);
            }else {
                map.put(s, 0);
            }
        }

    }
}
