package cn.edu.sjzc.propertymanagment.pojo;

public class Inform {

    private Integer infrom_id;          //主键自增
    private String inform_title;        //公告标题
    private String inform_content;      //公告内容
    private String inform_time;         //公告时间
    private Integer inform_object;      //公告对象，0员工，1用户
    private Integer inform_admin_id;    //外键，管理员id

    public Integer getInfrom_id() {
        return infrom_id;
    }

    public void setInfrom_id(Integer infrom_id) {
        this.infrom_id = infrom_id;
    }

    public String getInform_title() {
        return inform_title;
    }

    public void setInform_title(String inform_title) {
        this.inform_title = inform_title;
    }

    public String getInform_content() {
        return inform_content;
    }

    public void setInform_content(String inform_content) {
        this.inform_content = inform_content;
    }

    public String getInform_time() {
        return inform_time;
    }

    public void setInform_time(String inform_time) {
        this.inform_time = inform_time;
    }

    public Integer getInform_object() {
        return inform_object;
    }

    public void setInform_object(Integer inform_object) {
        this.inform_object = inform_object;
    }

    public Integer getInform_admin_id() {
        return inform_admin_id;
    }

    public void setInform_admin_id(Integer inform_admin_id) {
        this.inform_admin_id = inform_admin_id;
    }

    @Override
    public String toString() {
        return "Inform{" +
                "infrom_id=" + infrom_id +
                ", inform_title='" + inform_title + '\'' +
                ", inform_content='" + inform_content + '\'' +
                ", inform_time='" + inform_time + '\'' +
                ", inform_object=" + inform_object +
                ", inform_admin_id=" + inform_admin_id +
                '}';
    }
}
