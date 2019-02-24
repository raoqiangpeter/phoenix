import com.raoqiang.phoenix.services.TableOperator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.Set;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class PhoenixApplicationTests {

//    @Autowired
//    private TableOperator tableOperator;

    @Test
    public void contextLoads() {

//        jdbcTemplate.execute("select * from PREVIOUS_APPLICATION where SK_ID_PREV='1000027'");
//        jdbcTemplate.query("select * from PREVIOUS_APPLICATION where SK_ID_PREV='1000027'");
//        jdbcTemplate.execute("create table IF NOT EXISTS PHOENIX_TEST2 (ID INTEGER not null primary key, Name varchar(20),Age INTEGER)");
//       List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from PREVIOUS_APPLICATION where SK_ID_CURR='277601'");
//       for (Map map: list){
//           System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//           for (Object entry : map.entrySet()){
//               String s = ((Map.Entry<String, String>)entry).getKey() + " : " + ((Map.Entry<String, String>)entry).getValue();
//               System.out.println(s);
//           }
//
       }



}
