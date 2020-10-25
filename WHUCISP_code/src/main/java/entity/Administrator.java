package entity;

public class Administrator implements Visitor{

    private String UserName;   //登陆时用的用户名
    private String Name;       //本人真实姓名
    private String SchoolID;   //本人学号

    public Administrator(String userName, String name, String schoolID){
        UserName = userName;
        Name = name;
        SchoolID = schoolID;
    }

    //读取设置学号
    public void setSchoolID(String schoolID) {
        SchoolID = schoolID;
    }
    public String getSchoolID() {
        return SchoolID;
    }

    //读取设置学生真名
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    //读取设置学生用户名
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getUserName() {
        return UserName;
    }

    public String whoIAm(){
        return "Administrator";
    }
}
