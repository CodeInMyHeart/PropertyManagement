package cn.edu.sjzc.propertymanagment.pojo;

public class Admins {
    private Integer admin_id;           //主键，自增
    private String admin_username;      //登录名
    private String admin_pwd;           //密码
    private String admin_name;          //姓名
    private Integer admin_gender;       //性别
    private Integer admin_age;          //年龄
    private String admin_img;           //头像地址
    private String admin_idnumber;      //身份证号
    private String admin_phone;         //手机号

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_username() {
        return admin_username;
    }

    public void setAdmin_username(String admin_username) {
        this.admin_username = admin_username;
    }

    public String getAdmin_pwd() {
        return admin_pwd;
    }

    public void setAdmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public Integer getAdmin_gender() {
        return admin_gender;
    }

    public void setAdmin_gender(Integer admin_gender) {
        this.admin_gender = admin_gender;
    }

    public Integer getAdmin_age() {
        return admin_age;
    }

    public void setAdmin_age(Integer admin_age) {
        this.admin_age = admin_age;
    }

    public String getAdmin_img() {
        return admin_img;
    }

    public void setAdmin_img(String admin_img) {
        this.admin_img = admin_img;
    }

    public String getAdmin_idnumber() {
        return admin_idnumber;
    }

    public void setAdmin_idnumber(String admin_idnumber) {
        this.admin_idnumber = admin_idnumber;
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone;
    }

    @Override
    public String toString() {
        return "Admins{" +
                "admin_id=" + admin_id +
                ", admin_username='" + admin_username + '\'' +
                ", admin_pwd='" + admin_pwd + '\'' +
                ", admin_name='" + admin_name + '\'' +
                ", admin_gender=" + admin_gender +
                ", admin_age=" + admin_age +
                ", admin_img='" + admin_img + '\'' +
                ", admin_idnumber='" + admin_idnumber + '\'' +
                ", admin_phone='" + admin_phone + '\'' +
                '}';
    }
}
