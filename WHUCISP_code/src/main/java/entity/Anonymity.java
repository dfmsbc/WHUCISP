package entity;

public class Anonymity implements Visitor {

    private String UserName;   //登陆时用的用户名
    private String Name;       //本人真实姓名
    private String SchoolID;   //本人学号

    public Anonymity(){
        UserName = "匿名";
        Name = "";
        SchoolID = "";
    }

    //读取设置学生用户名
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getUserName() {
        return UserName;
    }

    public String whoIAm(){
        return "Anonymity";
    }
}
