package com.whu.whucisp.Controller;

import apply.Service.ApplyService;
import apply.Service.ApplyServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
public class ApplyController {
    private ApplyService applyService = new ApplyServiceImpl();

    @RequestMapping("/apply")
    public String apply(HttpServletRequest request){
        String name = request.getParameter("name");
        String schoolid = request.getParameter("schoolid");
        String club = request.getParameter("club");
        String telephone = request.getParameter("telephone");
        String selfintro = request.getParameter("selfintro");

        return applyService.apply(name,schoolid,club,telephone,selfintro);
    }
}
