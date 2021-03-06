package com.raoqiang.phoenix.services;

import com.alibaba.fastjson.JSONObject;
import com.raoqiang.phoenix.entry.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TableOperatorTest {

    private static final Logger log = LoggerFactory.getLogger(TableOperatorTest.class);

//    @Autowired
//    private TableOperator tableOperator;

    @Autowired
    private RestTemplate restTemplate;

//    @Test
//    public void test(){
//        Map map = new HashMap();
//        map.put("SK_ID_CURR", "100011");
//        tableOperator.selectByIndex("CREDIT_CARD_BALANCE","CCB_SS_INDEX", map, null);
//    }

    @Test
    public void rest(){
        restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
//        String url = "http://192.168.67.136:8080/phoenix/hbase/query/detail";
        String url = "http://localhost:8080/phoenix/hbase/query/detail";
        String params = "{\n" +
                "\t\"anthInfo\":{\n" +
                "\t\t\"user\":\"raoqiang\",\n" +
                "\t\t\"password\":\"123456\"\n" +
                "\t},\n" +
                "\t\"params\": {\n" +
                "\t\t\"tableName\": \"T_CREDIT_CARD\",\n" +
                "\t\t\"indexName\":\"\",\n" +
                "\t\t\"condition\":{\n" +
                "\t\t\t\"SK_ID_CURR\": \"100170\"\n" +
                "\t\t},\n" +
                "\t\t\"columns\":null\n" +
                "\t}\n" +
                "}";
        JSONObject jsonObj = JSONObject.parseObject(params);

        HttpEntity<String> formEntity = new HttpEntity<String>(jsonObj.toString(), headers);
        log.debug("请求URL为 -> " + url);
        log.debug("请求报文为 -> " + params);
//        log.debug("执行结果为 -> " + result.toString());
        Response result = null;

        try {
            result = restTemplate.postForObject(url, formEntity, Response.class);
        }catch (HttpServerErrorException.InternalServerError ise){
            ise.printStackTrace();
            log.error("执行结果为 -> " + ise.getResponseBodyAsString());
            result = new Response();
            result.setMessage(ise.getResponseBodyAsString());
            result.setStatus(-1);
            result.setSuccess(false);
        }catch (RestClientException e){
//            e.printStackTrace();
            log.error("执行结果为 -> " + e.getMessage());
        }finally {
            log.debug("执行结果为 -> " + result);
        }

//        System.out.println(result);
//        log.debug("执行结果为 -> " + result.toString());
    }

}