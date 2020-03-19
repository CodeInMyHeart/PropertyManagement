package cn.edu.sjzc.propertymanagment.pojo;

public class Buildings {
    private Integer build_id;           //主键自增
    private String build_number;        //楼号
    private String build_type;          //户型
    private String build_direction;     //朝向
    private String build_units;         //单元数
    private String build_layers;        //层数
    private Integer build_community_id;  //小区id

    public Integer getBuild_id() {
        return build_id;
    }

    public void setBuild_id(Integer build_id) {
        this.build_id = build_id;
    }

    public String getBuild_number() {
        return build_number;
    }

    public void setBuild_number(String build_number) {
        this.build_number = build_number;
    }

    public String getBuild_type() {
        return build_type;
    }

    public void setBuild_type(String build_type) {
        this.build_type = build_type;
    }

    public String getBuild_direction() {
        return build_direction;
    }

    public void setBuild_direction(String build_direction) {
        this.build_direction = build_direction;
    }

    public String getBuild_units() {
        return build_units;
    }

    public void setBuild_units(String build_units) {
        this.build_units = build_units;
    }

    public String getBuild_layers() {
        return build_layers;
    }

    public void setBuild_layers(String build_layers) {
        this.build_layers = build_layers;
    }

    public Integer getBuild_community_id() {
        return build_community_id;
    }

    public void setBuild_community_id(Integer build_community_id) {
        this.build_community_id = build_community_id;
    }

    @Override
    public String toString() {
        return "Buildings{" +
                "build_id=" + build_id +
                ", build_number='" + build_number + '\'' +
                ", build_type='" + build_type + '\'' +
                ", build_direction='" + build_direction + '\'' +
                ", build_units='" + build_units + '\'' +
                ", build_layers='" + build_layers + '\'' +
                ", build_community_id=" + build_community_id +
                '}';
    }
}
