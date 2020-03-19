package cn.edu.sjzc.propertymanagment.pojo;

public class Community {
    private Integer community_id;                //主键，自增
    private String community_name;              //小区名称
    private String community_area_total;        //占地面积
    private String community_area_street;       //街道面积
    private String community_area_build;        //建筑面积
    private String community_area_green;        //绿化面积
    private String community_carport;           //车位数量
    private String community_describ;           //小区描述

    public Integer getCommunity_id() {
        return community_id;
    }

    public void setCommunity_id(Integer community_id) {
        this.community_id = community_id;
    }

    public String getCommunity_name() {
        return community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public String getCommunity_area_total() {
        return community_area_total;
    }

    public void setCommunity_area_total(String community_area_total) {
        this.community_area_total = community_area_total;
    }

    public String getCommunity_area_street() {
        return community_area_street;
    }

    public void setCommunity_area_street(String community_area_street) {
        this.community_area_street = community_area_street;
    }

    public String getCommunity_area_build() {
        return community_area_build;
    }

    public void setCommunity_area_build(String community_area_build) {
        this.community_area_build = community_area_build;
    }

    public String getCommunity_area_green() {
        return community_area_green;
    }

    public void setCommunity_area_green(String community_area_green) {
        this.community_area_green = community_area_green;
    }

    public String getCommunity_carport() {
        return community_carport;
    }

    public void setCommunity_carport(String community_carport) {
        this.community_carport = community_carport;
    }

    public String getCommunity_describ() {
        return community_describ;
    }

    public void setCommunity_describ(String community_describ) {
        this.community_describ = community_describ;
    }

    @Override
    public String toString() {
        return "Community{" +
                "community_id=" + community_id +
                ", community_name='" + community_name + '\'' +
                ", community_area_total='" + community_area_total + '\'' +
                ", community_area_street='" + community_area_street + '\'' +
                ", community_area_build='" + community_area_build + '\'' +
                ", community_area_green='" + community_area_green + '\'' +
                ", community_carport='" + community_carport + '\'' +
                ", community_describ='" + community_describ + '\'' +
                '}';
    }
}
