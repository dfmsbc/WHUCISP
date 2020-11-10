package login.Service;

import entity.Anonymity;
import entity.User;
import factory.AnonyFac;
import login.Dao.LoginDao;
import login.Dao.LoginDaoImpl;
import org.springframework.ui.Model;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

public class LoginServiceImpl implements LoginService{

    private LoginDao loginDao = new LoginDaoImpl();

    public String login(String username, String password, String btn_login, HttpServletResponse response, Model model) {

        User check_login = loginDao.findByName_Login(username,password);
        if(check_login != null){
            int ok = 1;
            model.addAttribute("ok",ok);
            model.addAttribute("success_login_username",username);
            String token = loginDao.findTokenByName(username);
            response.addCookie(new Cookie("token",token));
            return "redirect:/index/index.html";
        }else{
            model.addAttribute("error_btn_login",btn_login);
            model.addAttribute("error_login_username",username);
            model.addAttribute("error_login_password",password);
            return "error";
        }
    }

    public String return_login(){
        return "redirect:/login/login.html";
    }

    public String return_regist(){
        return "redirect:/login/regist.html";
    }

    public String return_Anony(){
        AnonyFac anonyFac = new AnonyFac();
        Anonymity anonymity = anonyFac.createVisitor();
        return "redirect:/index/index.html";
    }
}
