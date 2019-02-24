package com.raoqiang.phoenix.controllers;

import com.raoqiang.phoenix.entry.Request;
import com.raoqiang.phoenix.entry.Response;
import com.raoqiang.phoenix.services.TableOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Map;

@Controller
//表示该controller类下所有的方法都公用的一级上下文根
@RequestMapping(value = "/phoenix")
public class HbaseController {

    @Autowired
    private TableOperator tableOperator;

    @RequestMapping(value = "/hbase/query/detail", method = RequestMethod.POST)
    @ResponseBody
    public Response hbaseOperate(@RequestBody Request hbaseRequest){
        System.out.println(hbaseRequest);
        List<Map<String, Object>> list = tableOperator.selectByIndex(hbaseRequest.getParams().getTableName(),
                hbaseRequest.getParams().getIndexName(),hbaseRequest.getParams().getCondition(), hbaseRequest.getParams().getColumns());
        Response response = new Response(1,"查询成功", true);
        response.setData(list);
        response.setLength(list!=null?list.size():0);
        return response;
    }



}
