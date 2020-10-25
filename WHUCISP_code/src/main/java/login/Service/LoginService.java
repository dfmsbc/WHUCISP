package login.Service;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletResponse;

public interface LoginService {
    public String return_login();
    public String return_regist();
    public String return_Anony();
    public String login(String username, String password, String btn_login, HttpServletResponse response, Model model);
}
