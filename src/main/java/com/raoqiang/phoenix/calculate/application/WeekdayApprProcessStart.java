package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import com.raoqiang.phoenix.calculate.constant.ApplicationLabelIndex;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.Map;

public class WeekdayApprProcessStart implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        // WEEKDAY_APPR_PROCESS_START
        String tmp = GetValueFromMap.getString(map, "WEEKDAY_APPR_PROCESS_START");
        if (tmp == null){
            map.put("WEEKDAY_APPR_PROCESS_START", null);
        }else {
            int index = Arrays.asList(ApplicationLabelIndex.WEEKDAY_APPR_PROCESS_START_INDEX).indexOf(tmp);
            if (index < 0){
                map.put("WEEKDAY_APPR_PROCESS_START", null);
            }else {
                map.put("WEEKDAY_APPR_PROCESS_START", index);
            }
        }
    }
}
