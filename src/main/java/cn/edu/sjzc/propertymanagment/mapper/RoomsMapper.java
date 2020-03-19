package cn.edu.sjzc.propertymanagment.mapper;

import cn.edu.sjzc.propertymanagment.pojo.Rooms;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 方法：
 *      1. 添加房间
 *      2. 根据id删除房间
 *      3. 查询所有房间
 *      4. 根据id查询
 *      5. 根据房号查询
 *      6. 根据条件查询房间
 */

@Repository
@Mapper
public interface RoomsMapper {

    /*add*/

    Integer addRoom(Rooms room);                //添加房间

    /*delete*/

    void deleteRoomById(Integer id);         //根据id删除房间

    /*update*/

    Integer updateRoomById(Rooms room);


    /*find*/

    List<Rooms> findAllRooms();                 //查询所有房间

    Rooms findRoomById(Integer id);                 //根据id查询

    Rooms findRoomByRoomNumber(String roomNumber);      //根据房号查询

    List<Rooms> findRoomByCondition(Rooms room);        //根据条件查询房间

}
