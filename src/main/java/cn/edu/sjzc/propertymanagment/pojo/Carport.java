package cn.edu.sjzc.propertymanagment.pojo;

public class Carport {
    private Integer carport_id;             //主键，自增
    private String carport_number;          //车位号
    private String carport_area;            //车位面积
    private Integer carport_status;         //出售状态，默认0，0未出售，1已出售
    private String carport_cartype;         //车类型
    private String carport_car_number;      //车牌号
    private Integer carport_owner_id;       //外键，车主id、
    private Integer carport_community_id;   //外键，小区id

    public Integer getCarport_id() {
        return carport_id;
    }

    public void setCarport_id(Integer carport_id) {
        this.carport_id = carport_id;
    }

    public String getCarport_number() {
        return carport_number;
    }

    public void setCarport_number(String carport_number) {
        this.carport_number = carport_number;
    }

    public String getCarport_area() {
        return carport_area;
    }

    public void setCarport_area(String carport_area) {
        this.carport_area = carport_area;
    }

    public Integer getCarport_status() {
        return carport_status;
    }

    public void setCarport_status(Integer carport_status) {
        this.carport_status = carport_status;
    }

    public String getCarport_cartype() {
        return carport_cartype;
    }

    public void setCarport_cartype(String carport_cartype) {
        this.carport_cartype = carport_cartype;
    }

    public String getCarport_car_number() {
        return carport_car_number;
    }

    public void setCarport_car_number(String carport_car_number) {
        this.carport_car_number = carport_car_number;
    }

    public Integer getCarport_owner_id() {
        return carport_owner_id;
    }

    public void setCarport_owner_id(Integer carport_owner_id) {
        this.carport_owner_id = carport_owner_id;
    }

    public Integer getCarport_community_id() {
        return carport_community_id;
    }

    public void setCarport_community_id(Integer carport_community_id) {
        this.carport_community_id = carport_community_id;
    }

    @Override
    public String toString() {
        return "Carport{" +
                "carport_id=" + carport_id +
                ", carport_number='" + carport_number + '\'' +
                ", carport_area='" + carport_area + '\'' +
                ", carport_status=" + carport_status +
                ", carport_cartype='" + carport_cartype + '\'' +
                ", carport_car_number='" + carport_car_number + '\'' +
                ", carport_owner_id=" + carport_owner_id +
                ", carport_community_id=" + carport_community_id +
                '}';
    }
}
