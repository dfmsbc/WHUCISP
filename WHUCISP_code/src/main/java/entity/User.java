package entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description="用户实体")
public class User implements Visitor {

    @ApiModelProperty("用户登陆名")
    private String UserName;   //登陆时用的用户名
    @ApiModelProperty("用户本人姓名")
    private String Name;       //本人真实姓名
    @ApiModelProperty("用户学号")
    private String SchoolID;   //本人学号
    @ApiModelProperty("用户密码")
    private String Password;
    @ApiModelProperty("用户token（令牌）")
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

    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
}
