package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class WallsmaterialMode implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // WALLSMATERIAL_MODE
        String tmp = GetValueFromMap.getString(map, "WALLSMATERIAL_MODE");
        if (tmp == null){
            map.put("WALLSMATERIAL_MODE", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.WALLSMATERIAL_MODE_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("WALLSMATERIAL_MODE", null);
            }else {
                map.put("WALLSMATERIAL_MODE", index);
            }
        }
    }
}
