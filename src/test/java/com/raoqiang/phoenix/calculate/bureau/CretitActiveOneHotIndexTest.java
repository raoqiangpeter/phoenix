package com.raoqiang.phoenix.calculate.bureau;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CretitActiveOneHotIndexTest {

    @Test
    public void labelCalculate() {

        Map map = new HashMap();
        map.put("CREDIT_ACTIVE", null);
        System.out.println(map);
        new CretitActiveOneHotIndex().labelCalculate(map, null);
        System.out.println(map);

    }
}