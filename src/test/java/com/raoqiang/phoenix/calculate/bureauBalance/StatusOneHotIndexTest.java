package com.raoqiang.phoenix.calculate.bureauBalance;

import com.raoqiang.phoenix.calculate.bureau.CretitActiveOneHotIndex;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StatusOneHotIndexTest {

    @Test
    public void labelCalculate() {
        Map map = new HashMap();
        map.put("STATUS", "X");
        System.out.println(map);
        new StatusOneHotIndex().labelCalculate(map, null);
        System.out.println(map);
    }
}