package com.raoqiang.phoenix.services;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TableOperator {

    private static final Log LOG = LogFactory.getLog(TableOperator.class);

    @Autowired
    @Qualifier("phoenixJdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    public int insert(String table_name, Map condition){
        /*
         upsert into PHOENIX_TEST2 values(1, 'raoqiang', 28);
         */
        if(condition==null || condition.isEmpty()){
            return -1;
        }

        StringBuffer keys = new StringBuffer();
        StringBuffer values = new StringBuffer();

        for (Object key : condition.keySet()){
            keys.append(key+",");
            if(condition.get(key).getClass() != String.class)
                values.append(""+condition.get(key)+",");
            else
                values.append("'"+condition.get(key)+"',");
        }
        String sql = " upsert into "+ table_name +"("+ keys.toString().substring(0, keys.length()-1) +") values("+
                values.toString().substring(0, values.length()-1) +")";
//        System.out.println(sql);
        LOG.debug("执行sql语句：" + sql);
        try {
            jdbcTemplate.execute(sql);
            return 1;
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
        return -1;
    }


    public List<Map<String, Object>> selectByIndex(String table_name, String index, Map condition, Set columns){
        if(index==null || index.equals("")){
            return select(table_name, condition, columns);
        }
        else {
            Map conditonIndex = new HashMap();
            for (Object key: condition.keySet()){
                conditonIndex.put("\":" + key + "\"", condition.get(key));
            }
            List<Map<String, Object>> condition_columns = select(index, conditonIndex, null);
            List<Map<String, Object>> result = new ArrayList<>();
            for (Map condition_column: condition_columns){
                Map condition_column_tmp = new HashMap();
                for (Object key: condition_column.keySet()){
                    condition_column_tmp.put(((String)key).substring(1), condition_column.get(key));
                }
                result.addAll(select(table_name, condition_column_tmp, columns));
//                result.addAll()
            }
            return result;
        }
    }


    private List<Map<String, Object>> select(String table_name, Map condition, Set columns){
        StringBuffer column = new StringBuffer();
        StringBuffer conditions = new StringBuffer();
//        StringBuffer values = new StringBuffer();
        if(columns != null){
            for(Object s : columns){
                column.append(s+",");
            }
        }

        if(condition != null){
            for (Object key : condition.keySet()){
                conditions.append(" and ");
//                System.out.println("key : "+ key + ", value : "+ condition.get(key) + ", type : " +condition.get(key).getClass());
                if(condition.get(key).getClass() != String.class)
                    conditions.append(key+"="+condition.get(key));
                else
                    conditions.append(key+"='"+condition.get(key)+"'");
            }
        }

        // select name from PHOENIX_TEST2 where ID=1
        if(column.length()==0){
            column.append("**");
        }
        String sql = "select " + column.toString().substring(0, column.length()-1) + " from "+
                table_name +" where 1=1" + conditions;
        if(condition == null || condition.size()==0){
            sql = sql.replace("where", "");
        }

        sql = sql.replace(" 1=1 and","").replace(" 1=1","");
        LOG.debug("执行sql语句：" + sql);
//        System.out.println(sql);
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
//        System.out.println(list);
        LOG.debug("返回结果：" + list);
        return list;
    }


}
