package cn.edu.sjzc.propertymanagment.mapper;

import cn.edu.sjzc.propertymanagment.pojo.Buildings;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 方法：
 *      1. 添加楼
 *      2. 删除楼根据id
 *      3. 更新楼
 *      4. 根据id查询楼
 *      5. 查询所有楼
 */
@Repository
@Mapper
public interface BuildingsMapper {


    /*add*/

    Integer addBuilding(Buildings building);            //添加楼

    /*delete*/

    void deleteBuildingId(Integer id);                    //删除楼根据id


    /*update*/

    Integer updateBuilding(Buildings building);         //更新楼

    /*find*/

    Buildings findBuildingById(Integer id);             //根据id查询楼

    List<Buildings> findAllBuildings();                 //查询所有楼

}
