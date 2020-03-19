package cn.edu.sjzc.propertymanagment.testmapper;

import cn.edu.sjzc.propertymanagment.mapper.AdminsMapper;
import cn.edu.sjzc.propertymanagment.pojo.Admins;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestAdmins {

    @Autowired
    AdminsMapper adminsMapper;

    @Test
    public void test(){
        Admins admin1 = adminsMapper.findByUsername("zhaoyubin");
        System.out.println(admin1);
    }
}
