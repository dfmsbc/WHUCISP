package entity;

public class User implements Visitor {

    private String UserName;   //登陆时用的用户名
    private String Name;       //本人真实姓名
    private String SchoolID;   //本人学号
    private String Password;
    private String Token;

    public User(String userName, String name, String schoolID, String token, String password){
        UserName = userName;
        Name = name;
        SchoolID = schoolID;
        Token = token;
        Password = password;
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
        return "User";
    }

    public String getToken() {
        return Token;
    }
    public void setToken(String token) {
        Token = token;
    }

    public String getPwd() {
        return Password;
    }
    public void setPwd(String password) {
        Password = password;
    }
}
