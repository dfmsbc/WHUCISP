package apply.Dao;

import entity.Apply;
import singleton.ChuShiConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ApplyDaoImpl implements ApplyDao{
    private static Connection con = ChuShiConnection.getConnection();

    @Override
    public Boolean insert (Apply apply){
        try {
            PreparedStatement ps = con.prepareStatement("insert into ChuShi(Name,SchoolID,Club,Telephone,SelfIntro) values(?,?,?,?,?)");
            ps.setString(1,apply.getName());
            ps.setString(2,apply.getSchoolID());
            ps.setString(3,apply.getClub());
            ps.setString(4,apply.getTelephone());
            ps.setString(5,apply.getSelfIntro());
            int i = ps.executeUpdate();
            if (i==1){
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
