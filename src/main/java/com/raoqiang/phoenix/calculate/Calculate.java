package com.raoqiang.phoenix.calculate;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public interface Calculate {

    void labelCalculate(Map map, JdbcTemplate jdbcTemplate);

}
