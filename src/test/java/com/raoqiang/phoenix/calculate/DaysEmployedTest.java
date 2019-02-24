package com.raoqiang.phoenix.calculate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.raoqiang.phoenix.calculate.constant.DropIndex;
import com.raoqiang.phoenix.entry.Application;
import com.raoqiang.phoenix.services.TableOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DaysEmployedTest {

    @Autowired
    private TableOperator tableOperator;

    @Test
    public void labelCalculate() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException {
        File file = new File("E:\\workspace\\spark-study\\phoenix\\src\\main\\resources\\application.json");
        InputStream is = new FileInputStream(file);
        byte[] bytes = new byte[1024];
        String rs = "";
//        int a;
        while ((is.read(bytes))>0){
            rs += new String(bytes);
            bytes=new byte[1024];
        }
//        System.out.println(rs);
        Application application = JSON.parseObject(rs, Application.class);
        System.out.println(application);
        Map map = application.getData();

        // -----------------------------------------------------------------------------
        // 处理 application_train/test
        String[] strs = new String[]{"DaysEmployed", "ExtSourcesMax", "ExtSourcesMean", "ExtSourcesMin", "NewDocKurt",
                "ExtSourcesProd", "ExtSourcesWeighted", "AgeRange", "DocumentCount", "CreditToAnnuityRatio",
                "CreditToGoodsRatio", "AnnuityToIncomeRatio", "CreditToIncomeRatio", "IncomeToEmployedRatio",
                "EmployedToBirthRatio", "IdToBirthRatio", "CarToBirthRatio", "CarToEmployedRatio", "PhoneToBirthRatio",
                "CodeGender", "EmergencystateMode", "FlagOwnCar", "FlagOwnRealty", "FondkapremontMode", "HousetypeMode",
                "NameContractType", "NameEducationType", "NameFamilyStatus", "NameHousingType", "NameIncomeType",
                "NameTypeSuite", "OccupationType", "OrganizationType", "WallsmaterialMode", "WeekdayApprProcessStart"

        };
        Class<?> clazz;
        for(String s: strs){
            clazz = Class.forName("com.raoqiang.phoenix.calculate.application."+s);
            Calculate calculate = (Calculate) clazz.newInstance();
            calculate.labelCalculate(map, null);
        }
        GetValueFromMap.removeKeysFromMap(map, DropIndex.APPLICATION_DROP_INDEX);


        // --------------------------------------------------------------------------------
        // 处理 BUREAU

        Map condition = new HashMap();
        condition.put("SK_ID_BUREAU", map.get("SK_ID_CURR") + "");
        List bureaus = tableOperator.selectByIndex("BUREAU", "", condition, null);
        System.out.println(application);
        System.out.println(JSON.toJSONString(application, SerializerFeature.WriteMapNullValue));
    }
}