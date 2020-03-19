package cn.edu.sjzc.propertymanagment.pojo;

public class Messages {
    private Integer message_id;         //主键，自增
    private String message_title;       //标题
    private String message_content;     //内容
    private String message_time;        //时间
    private Integer message_status;     //查看状态，默认0，0未查看，1已查看
    private Integer message_owner_id;   //被通知人id

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public String getMessage_title() {
        return message_title;
    }

    public void setMessage_title(String message_title) {
        this.message_title = message_title;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }

    public Integer getMessage_status() {
        return message_status;
    }

    public void setMessage_status(Integer message_status) {
        this.message_status = message_status;
    }

    public Integer getMessage_owner_id() {
        return message_owner_id;
    }

    public void setMessage_owner_id(Integer message_owner_id) {
        this.message_owner_id = message_owner_id;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "message_id=" + message_id +
                ", message_title='" + message_title + '\'' +
                ", message_content='" + message_content + '\'' +
                ", message_time='" + message_time + '\'' +
                ", message_status=" + message_status +
                ", message_owner_id=" + message_owner_id +
                '}';
    }
}
