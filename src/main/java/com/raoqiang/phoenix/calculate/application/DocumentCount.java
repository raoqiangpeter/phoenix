package com.raoqiang.phoenix.calculate.application;

import com.raoqiang.phoenix.calculate.Calculate;
import com.raoqiang.phoenix.calculate.GetValueFromMap;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class DocumentCount implements Calculate {
    @Override
    public void labelCalculate(Map map, JdbcTemplate jdbcTemplate) {
        /*
            df['DOCUMENT_COUNT'] = df[docs].sum(axis=1)
            FLAG_DOCUMENT_2 到 FLAG_DOCUMENT_21求和
         */
        double res = 0;
        for (int i=2; i<22; i++){
            if (GetValueFromMap.getDouble(map, "FLAG_DOCUMENT_"+i) == null)
                continue;
            res += GetValueFromMap.getDouble(map, "FLAG_DOCUMENT_"+i);
        }
        map.put("DOCUMENT_COUNT", res);

    }
}
