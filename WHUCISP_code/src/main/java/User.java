public class User {

    private StringBuilder UserName;   //登陆时用的用户名
    private StringBuilder Name;       //本人真实姓名
    private StringBuilder SchoolID;   //本人学号

    public User(StringBuilder userName, StringBuilder name, StringBuilder schoolID){
        UserName = userName;
        Name = name;
        SchoolID = schoolID;
    }

    //读取设置学号
    public void setSchoolID(StringBuilder schoolID) {
        SchoolID = schoolID;
    }

    public StringBuilder getSchoolID() {
        return SchoolID;
    }


    //读取设置学生真名
    public void setName(StringBuilder name) {
        Name = Name;
    }

    public StringBuilder getName() {
        return Name;
    }

    //读取设置学生用户名
    public void setUserName(StringBuilder userName) {
        UserName = userName;
    }

    public StringBuilder getUserName() {
        return UserName;
    }


}
