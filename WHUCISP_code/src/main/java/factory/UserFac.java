package factory;

import entity.User;
import entity.Visitor;

public class UserFac implements VisitorFactory {
    private String Name;
    private String username;
    private String schoolid;
    private String token;
    private String pwd;

    public void getInfo(String userName, String name, String schoolID, String Token, String password){
        Name = name;
        username = userName;
        schoolid = schoolID;
        token = Token;
        pwd = password;
    }

    @Override
    public User createVisitor(){
        return new User(username, Name, schoolid, token, pwd);
    }
}
