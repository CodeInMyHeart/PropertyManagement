package cn.edu.sjzc.propertymanagment.testmapper;

import cn.edu.sjzc.propertymanagment.mapper.BuildingsMapper;
import cn.edu.sjzc.propertymanagment.mapper.RoomsMapper;
import cn.edu.sjzc.propertymanagment.pojo.Buildings;
import cn.edu.sjzc.propertymanagment.pojo.Rooms;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TestBuild {

    @Autowired
    BuildingsMapper buildingsMapper;

    @Autowired
    RoomsMapper roomsMapper;
    @Test
    public void test(){

        Buildings buildings = new Buildings();
        buildings.setBuild_id(10);
        buildings.setBuild_number("1");
        buildings.setBuild_layers("108");
        Integer integer = buildingsMapper.addBuilding(buildings);
        List<Buildings> allBuildings =  buildingsMapper.findAllBuildings();

/*      Rooms rooms = new Rooms();
        rooms.setRoom_build_bumber("3");
        rooms.setRoom_describ("这是楼");
        Integer integer = roomsMapper.addRoom(rooms);
*/
        System.out.println(integer);
        System.out.println(buildings.getBuild_id());

    }

    @Test
    public void testRoomFind(){
        Rooms room = new Rooms();
        /*room.setRoom_layer("12");
        room.setRoom_id(1);*/
        /*room.setRoom_number("1");
        List<Rooms> roomByCondition = roomsMapper.findRoomByCondition(room);
        for(Rooms r:roomByCondition){
            System.out.println(r);
        }*/

        room.setRoom_id(1);
        room.setRoom_number("1202");
        room.setRoom_describ("这是赵玉彬的房间");
        room.setRoom_layer("108");
        room.setRoom_build_bumber("1");
        room.setRoom_type("四室一厅");
        room.setRoom_status(1);
        room.setRoom_unit("1");
        Integer integer = roomsMapper.updateRoomById(room);
        System.out.println(integer);
        Rooms roomById = roomsMapper.findRoomById(1);
        System.out.println(roomById);

    }
}
