package cn.edu.sjzc.propertymanagment.pojo;

public class Rooms {
    private Integer room_id;                //主键，自增
    private String room_build_bumber;       //楼号
    private String room_unit;               //单元号
    private String room_number;             //门牌号
    private String room_layer;              //楼层
    private String room_area;               //面积
    private String room_type;               //布局
    private String room_date;               //date型，出售时间
    private Integer room_status;            //出售状态，默认0，0未出售，1已出售
    private String room_describ;            //描述，备注
    private Integer room_owner_id;          //外键，业主id
    private Integer room_build_id;          //楼id

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public String getRoom_build_bumber() {
        return room_build_bumber;
    }

    public void setRoom_build_bumber(String room_build_bumber) {
        this.room_build_bumber = room_build_bumber;
    }

    public String getRoom_unit() {
        return room_unit;
    }

    public void setRoom_unit(String room_unit) {
        this.room_unit = room_unit;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getRoom_layer() {
        return room_layer;
    }

    public void setRoom_layer(String room_layer) {
        this.room_layer = room_layer;
    }

    public String getRoom_area() {
        return room_area;
    }

    public void setRoom_area(String room_area) {
        this.room_area = room_area;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getRoom_date() {
        return room_date;
    }

    public void setRoom_date(String room_date) {
        this.room_date = room_date;
    }

    public Integer getRoom_status() {
        return room_status;
    }

    public void setRoom_status(Integer room_status) {
        this.room_status = room_status;
    }

    public String getRoom_describ() {
        return room_describ;
    }

    public void setRoom_describ(String room_describ) {
        this.room_describ = room_describ;
    }

    public Integer getRoom_owner_id() {
        return room_owner_id;
    }

    public void setRoom_owner_id(Integer room_owner_id) {
        this.room_owner_id = room_owner_id;
    }

    public Integer getRoom_build_id() {
        return room_build_id;
    }

    public void setRoom_build_id(Integer room_build_id) {
        this.room_build_id = room_build_id;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "room_id=" + room_id +
                ", room_build_bumber='" + room_build_bumber + '\'' +
                ", room_unit='" + room_unit + '\'' +
                ", room_number='" + room_number + '\'' +
                ", room_layer='" + room_layer + '\'' +
                ", room_area='" + room_area + '\'' +
                ", room_type='" + room_type + '\'' +
                ", room_date='" + room_date + '\'' +
                ", room_status=" + room_status +
                ", room_describ='" + room_describ + '\'' +
                ", room_owner_id=" + room_owner_id +
                ", room_build_id=" + room_build_id +
                '}';
    }
}
