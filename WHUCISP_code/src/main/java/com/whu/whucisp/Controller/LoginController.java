package com.whu.whucisp.Controller;

import login.Service.LoginService;
import login.Service.LoginServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    LoginService loginService = new LoginServiceImpl();

    //验证账号密码
    @PostMapping("/login")
    //获取三个参数，账号，密码，按钮是否被点击
    public String login(@Param("username") String username, @Param("password") String password, @Param("btn_login") String btn_login, HttpServletResponse response, Model model) {
        return loginService.login(username,password,btn_login,response,model);
    }
    //返回登录页面
    @GetMapping("/login.html")
    public String return_login(){
        return loginService.return_login();
    }
    //返回注册页面
    @GetMapping("/regist.html")
    public String return_regist(){
        return loginService.return_regist();
    }
    //匿名登陆
    @RequestMapping("/anonymous")
    public String return_Anony(){
        return loginService.return_Anony();
    }
}
