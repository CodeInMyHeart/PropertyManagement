package cn.edu.sjzc.propertymanagment.pojo;

public class Repairs {
    private Integer repair_id;              //主键自增
    private String repair_title;            //报修标题
    private String repair_content;          //报修内容
    private Integer repair_type;            //报修类型
    private String repair_time;             //报修时间
    private String repair_address;          //报修地址
    private Integer repair_owner_id;        //外键，报修人id
    private Integer repair_status;          //维修状态，默认0，0未接收，1已接受处理，2，维修完成
    private String repair_deal_date;        //处理时间
    private String repair_complete_date;    //处理完成时间
    private String repair_result;           //处理结果
    private Integer repair_bill_status;     //缴费状态，默认0，0未缴费，1已缴费
    private Double repair_bill;             //缴费金额
    private Integer repair_employee_id;     //外键，维修人id

    public Integer getRepair_id() {
        return repair_id;
    }

    public void setRepair_id(Integer repair_id) {
        this.repair_id = repair_id;
    }

    public String getRepair_title() {
        return repair_title;
    }

    public void setRepair_title(String repair_title) {
        this.repair_title = repair_title;
    }

    public String getRepair_content() {
        return repair_content;
    }

    public void setRepair_content(String repair_content) {
        this.repair_content = repair_content;
    }

    public Integer getRepair_type() {
        return repair_type;
    }

    public void setRepair_type(Integer repair_type) {
        this.repair_type = repair_type;
    }

    public String getRepair_time() {
        return repair_time;
    }

    public void setRepair_time(String repair_time) {
        this.repair_time = repair_time;
    }

    public String getRepair_address() {
        return repair_address;
    }

    public void setRepair_address(String repair_address) {
        this.repair_address = repair_address;
    }

    public Integer getRepair_owner_id() {
        return repair_owner_id;
    }

    public void setRepair_owner_id(Integer repair_owner_id) {
        this.repair_owner_id = repair_owner_id;
    }

    public Integer getRepair_status() {
        return repair_status;
    }

    public void setRepair_status(Integer repair_status) {
        this.repair_status = repair_status;
    }

    public String getRepair_deal_date() {
        return repair_deal_date;
    }

    public void setRepair_deal_date(String repair_deal_date) {
        this.repair_deal_date = repair_deal_date;
    }

    public String getRepair_complete_date() {
        return repair_complete_date;
    }

    public void setRepair_complete_date(String repair_complete_date) {
        this.repair_complete_date = repair_complete_date;
    }

    public String getRepair_result() {
        return repair_result;
    }

    public void setRepair_result(String repair_result) {
        this.repair_result = repair_result;
    }

    public Integer getRepair_bill_status() {
        return repair_bill_status;
    }

    public void setRepair_bill_status(Integer repair_bill_status) {
        this.repair_bill_status = repair_bill_status;
    }

    public Double getRepair_bill() {
        return repair_bill;
    }

    public void setRepair_bill(Double repair_bill) {
        this.repair_bill = repair_bill;
    }

    public Integer getRepair_employee_id() {
        return repair_employee_id;
    }

    public void setRepair_employee_id(Integer repair_employee_id) {
        this.repair_employee_id = repair_employee_id;
    }

    @Override
    public String toString() {
        return "Repairs{" +
                "repair_id=" + repair_id +
                ", repair_title='" + repair_title + '\'' +
                ", repair_content='" + repair_content + '\'' +
                ", repair_type=" + repair_type +
                ", repair_time='" + repair_time + '\'' +
                ", repair_address='" + repair_address + '\'' +
                ", repair_owner_id=" + repair_owner_id +
                ", repair_status=" + repair_status +
                ", repair_deal_date='" + repair_deal_date + '\'' +
                ", repair_complete_date='" + repair_complete_date + '\'' +
                ", repair_result='" + repair_result + '\'' +
                ", repair_bill_status=" + repair_bill_status +
                ", repair_bill=" + repair_bill +
                ", repair_employee_id=" + repair_employee_id +
                '}';
    }
}
