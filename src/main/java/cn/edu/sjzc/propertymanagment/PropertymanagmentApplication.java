package cn.edu.sjzc.propertymanagment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.sjzc.propertymanagment.mapper")
public class PropertymanagmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PropertymanagmentApplication.class, args);
    }

}
