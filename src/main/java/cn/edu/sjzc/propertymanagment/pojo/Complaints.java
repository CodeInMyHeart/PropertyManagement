package cn.edu.sjzc.propertymanagment.pojo;

public class Complaints {
    private Integer complaint_id;           //主键，自增
    private String complaint_title;         //投诉标题
    private String complaint_content;       //投诉内容
    private String complaint_time;          //投诉时间
    private Integer complaint_status;       //处理状态，默认0，0未处理，1处理中，2，已处理
    private String complaint_result;        //处理结果
    private Integer complaint_owner_id;     //投诉人id

    public Integer getComplaint_id() {
        return complaint_id;
    }

    public void setComplaint_id(Integer complaint_id) {
        this.complaint_id = complaint_id;
    }

    public String getComplaint_title() {
        return complaint_title;
    }

    public void setComplaint_title(String complaint_title) {
        this.complaint_title = complaint_title;
    }

    public String getComplaint_content() {
        return complaint_content;
    }

    public void setComplaint_content(String complaint_content) {
        this.complaint_content = complaint_content;
    }

    public String getComplaint_time() {
        return complaint_time;
    }

    public void setComplaint_time(String complaint_time) {
        this.complaint_time = complaint_time;
    }

    public Integer getComplaint_status() {
        return complaint_status;
    }

    public void setComplaint_status(Integer complaint_status) {
        this.complaint_status = complaint_status;
    }

    public String getComplaint_result() {
        return complaint_result;
    }

    public void setComplaint_result(String complaint_result) {
        this.complaint_result = complaint_result;
    }

    public Integer getComplaint_owner_id() {
        return complaint_owner_id;
    }

    public void setComplaint_owner_id(Integer complaint_owner_id) {
        this.complaint_owner_id = complaint_owner_id;
    }

    @Override
    public String toString() {
        return "Complaints{" +
                "complaint_id=" + complaint_id +
                ", complaint_title='" + complaint_title + '\'' +
                ", complaint_content='" + complaint_content + '\'' +
                ", complaint_time='" + complaint_time + '\'' +
                ", complaint_status=" + complaint_status +
                ", complaint_result='" + complaint_result + '\'' +
                ", complaint_owner_id=" + complaint_owner_id +
                '}';
    }
}
