package login.Dao;

import entity.User;
import entity.Visitor;

public interface LoginDao {

    Boolean insert(User user);

    User findByName(String name);

    User findByToken(String token);

    User findByName_Login(String name, String pwd);

    String findTokenByName(String name);
}
