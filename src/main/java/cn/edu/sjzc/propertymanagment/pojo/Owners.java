package cn.edu.sjzc.propertymanagment.pojo;

public class Owners {
    private Integer owner_id;           //主键自增
    private String owner_number;        //业主编号
    private String owner_pwd;           //业主密码
    private String owner_name;          //业主姓名
    private Integer owner_gender;       //业主性别
    private Integer owner_age;          //业主年龄
    private String owner_img;           //业主照片
    private String owner_id_no;         //业主身份证号
    private String owner_phone;         //业主手机号码
    private String owner_email;         //业主邮箱
    private Double owner_balance;       //业主余额

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_number() {
        return owner_number;
    }

    public void setOwner_number(String owner_number) {
        this.owner_number = owner_number;
    }

    public String getOwner_pwd() {
        return owner_pwd;
    }

    public void setOwner_pwd(String owner_pwd) {
        this.owner_pwd = owner_pwd;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public Integer getOwner_gender() {
        return owner_gender;
    }

    public void setOwner_gender(Integer owner_gender) {
        this.owner_gender = owner_gender;
    }

    public Integer getOwner_age() {
        return owner_age;
    }

    public void setOwner_age(Integer owner_age) {
        this.owner_age = owner_age;
    }

    public String getOwner_img() {
        return owner_img;
    }

    public void setOwner_img(String owner_img) {
        this.owner_img = owner_img;
    }

    public String getOwner_id_no() {
        return owner_id_no;
    }

    public void setOwner_id_no(String owner_id_no) {
        this.owner_id_no = owner_id_no;
    }

    public String getOwner_phone() {
        return owner_phone;
    }

    public void setOwner_phone(String owner_phone) {
        this.owner_phone = owner_phone;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public Double getOwner_balance() {
        return owner_balance;
    }

    public void setOwner_balance(Double owner_balance) {
        this.owner_balance = owner_balance;
    }

    @Override
    public String toString() {
        return "Owners{" +
                "owner_id=" + owner_id +
                ", owner_number='" + owner_number + '\'' +
                ", owner_pwd='" + owner_pwd + '\'' +
                ", owner_name='" + owner_name + '\'' +
                ", owner_gender=" + owner_gender +
                ", owner_age=" + owner_age +
                ", owner_img='" + owner_img + '\'' +
                ", owner_id_no='" + owner_id_no + '\'' +
                ", owner_phone='" + owner_phone + '\'' +
                ", owner_email='" + owner_email + '\'' +
                ", owner_balance=" + owner_balance +
                '}';
    }
}
