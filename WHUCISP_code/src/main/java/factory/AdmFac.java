package factory;

import entity.Administrator;
import entity.Visitor;

public class AdmFac implements VisitorFactory {
    private String Name;
    private String username;
    private String schoolid;

    public void  getInfo(String userName, String name, String schoolID){
        Name = name;
        username = userName;
        schoolid = schoolID;
    }

    @Override
    public Administrator createVisitor(){
        return new Administrator(username,Name,schoolid);
    }
}
