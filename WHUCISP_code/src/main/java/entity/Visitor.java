package entity;

public interface Visitor {

    //读取设置学生用户名
    public void setUserName(String userName);

    public String getUserName();

    public String whoIAm();
}
