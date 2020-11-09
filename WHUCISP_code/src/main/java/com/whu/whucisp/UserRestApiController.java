package com.whu.whucisp;

import entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import login.Dao.LoginDao;
import login.Dao.LoginDaoImpl;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@Api(tags = "用户登陆/注册/注销管理")
@RestController
@RequestMapping(value = "/users")     // 通过这里配置使下面的映射都在/users下
public class UserRestApiController {

    LoginDao loginDao = new LoginDaoImpl();

    /**
     * 处理"/users/"的GET请求，用来获取用户列表
     *
     * @return
     */
    @GetMapping("/")
    @ApiOperation(value = "获取用户列表")
    public List<User> getUserList() {
        List<User> r = loginDao.findAll();

        return r;
    }

    /**
     * 处理"/users/"的POST请求，用来创建User
     *
     * @param user
     * @return
     */
    @PostMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String postUser(@RequestBody User user) {
        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
        loginDao.add(user);
        return "success";
    }

    /**
     * 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
     *
     * @param schoolID
     * @return
     */
    @GetMapping("/{schoolID}")@ApiOperation(value = "获取用户详细信息", notes = "根据url的schoolID来获取用户详细信息")
    public User getUser(@PathVariable String schoolID) {
        return loginDao.findBySchoolID(schoolID);
    }

    /**
     * 处理"/users/{id}"的PUT请求，用来更新User信息
     *
     * @param schoolID
     * @param user
     * @return
     */
    @PutMapping("/{schoolID}")
    @ApiImplicitParam(paramType = "path", dataType = "String", name = "schoolID", value = "用户学号", required = true, example = "1")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的schoolID来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    public String putUser(@PathVariable String schoolID, @RequestBody User user) {
        User u = loginDao.findBySchoolID(schoolID);
        u.setName(user.getName());
        u.setPassword(user.getPassword());
        u.setSchoolID(user.getSchoolID());
        u.setToken(user.getToken());
        u.setUserName(user.getUserName());

        loginDao.update(u);
        return "success";
    }

    /**
     * 处理"/users/{schoolID}"的DELETE请求，用来删除User
     *
     * @param schoolID
     * @return
     */
    @DeleteMapping("/{schoolID}")
    @ApiOperation(value = "删除用户", notes = "根据url的schoolID来指定删除对象")
    public String deleteUser(@PathVariable String schoolID) {
        loginDao.remove(schoolID);
        return "success";
    }
}
