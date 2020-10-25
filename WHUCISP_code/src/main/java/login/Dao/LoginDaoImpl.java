package login.Dao;

import entity.User;
import entity.Visitor;
import factory.UserFac;
import factory.VisitorFactory;
import singleton.ChuShiConnection;
import singleton.UserConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
    private static Connection con = UserConnection.getConnection();

    @Override
    public Boolean insert(User user){
        try {
            PreparedStatement ps = con.prepareStatement("insert into Users(UserName,Password,Token) values(?,?,?)");
            ps.setString(1,user.getName());
            ps.setString(2,user.getPwd());
            ps.setString(3,user.getToken());
            int i = ps.executeUpdate();
            if (i==1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public User findByName(String name) {
        try {
            PreparedStatement ps = con.prepareStatement("select * from Users where username = ?");
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            String username, Name, schoolid, token, pwd;
            if(rs.next()){
                username = rs.getString(1);
                Name = rs.getString(2);
                schoolid = rs.getString(3);
                token = rs.getString(5);
                pwd = rs.getString(4);

                UserFac userfac = new UserFac();
                userfac.getInfo(username,Name,schoolid,token,pwd);
                return userfac.createVisitor();

            }
            else{
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User findByToken(String token){
        try {
            PreparedStatement ps = con.prepareStatement("select * from Users where token = ?");
            ps.setString(1,token);
            ResultSet rs = ps.executeQuery();
            String username, Name, schoolid, Token, pwd;
            if(rs.next()){
                username = rs.getString(1);
                Name = rs.getString(2);
                schoolid = rs.getString(3);
                Token = rs.getString(5);
                pwd = rs.getString(4);

                UserFac userfac = new UserFac();
                userfac.getInfo(username,Name,schoolid,Token,pwd);
                return userfac.createVisitor();

            }
            else{
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User findByName_Login(String name, String pwd){
        try {
            PreparedStatement ps = con.prepareStatement("select * from Users where username = ? and password = ?");
            ps.setString(1,name);
            ps.setString(2,pwd);
            ResultSet rs = ps.executeQuery();
            String username, Name, schoolid, Token, Pwd;
            if(rs.next()){
                username = rs.getString(1);
                Name = rs.getString(2);
                schoolid = rs.getString(3);
                Token = rs.getString(5);
                Pwd = rs.getString(4);

                UserFac userfac = new UserFac();
                userfac.getInfo(username,Name,schoolid,Token,Pwd);
                return userfac.createVisitor();

            }
            else{
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String findTokenByName(String name){
        try {
            PreparedStatement ps = con.prepareStatement("select Token from Users where username = ?");
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return rs.getString(1);
            }
            else{
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
