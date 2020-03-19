package cn.edu.sjzc.propertymanagment.pojo;

public class Advice {
    private Integer advice_id;          //主键自增
    private String advice_title;        //建议标题
    private String advice_content;      //建议内容
    private String advice_time;         //建议时间
    private Integer advice_status;      //建议状态，默认0，0未查看，1已查看
    private String  advice_result;      //处理结果
    private Integer advice_owner_id;    //外键，提建议的人id

    public Integer getAdvice_id() {
        return advice_id;
    }

    public void setAdvice_id(Integer advice_id) {
        this.advice_id = advice_id;
    }

    public String getAdvice_title() {
        return advice_title;
    }

    public void setAdvice_title(String advice_title) {
        this.advice_title = advice_title;
    }

    public String getAdvice_content() {
        return advice_content;
    }

    public void setAdvice_content(String advice_content) {
        this.advice_content = advice_content;
    }

    public String getAdvice_time() {
        return advice_time;
    }

    public void setAdvice_time(String advice_time) {
        this.advice_time = advice_time;
    }

    public Integer getAdvice_status() {
        return advice_status;
    }

    public void setAdvice_status(Integer advice_status) {
        this.advice_status = advice_status;
    }

    public String getAdvice_result() {
        return advice_result;
    }

    public void setAdvice_result(String advice_result) {
        this.advice_result = advice_result;
    }

    public Integer getAdvice_owner_id() {
        return advice_owner_id;
    }

    public void setAdvice_owner_id(Integer advice_owner_id) {
        this.advice_owner_id = advice_owner_id;
    }

    @Override
    public String toString() {
        return "Advice{" +
                "advice_id=" + advice_id +
                ", advice_title='" + advice_title + '\'' +
                ", advice_content='" + advice_content + '\'' +
                ", advice_time='" + advice_time + '\'' +
                ", advice_status=" + advice_status +
                ", advice_result='" + advice_result + '\'' +
                ", advice_owner_id=" + advice_owner_id +
                '}';
    }
}
