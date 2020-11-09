package login.Dao;

import entity.User;
import entity.Visitor;

import java.util.List;

public interface LoginDao {

    Boolean insert(User user);

    User findByName(String name);

    User findByToken(String token);

    User findByName_Login(String name, String pwd);

    String findTokenByName(String name);

    List<User> findAll();

    Boolean add(User user);

    User findBySchoolID(String schoolID);

    Boolean update(User user);

    Boolean remove(String schoolID);
}
