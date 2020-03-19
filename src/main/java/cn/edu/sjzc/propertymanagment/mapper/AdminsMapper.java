package cn.edu.sjzc.propertymanagment.mapper;

import cn.edu.sjzc.propertymanagment.pojo.Admins;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AdminsMapper {
    Admins findByUsername(String username);



}
