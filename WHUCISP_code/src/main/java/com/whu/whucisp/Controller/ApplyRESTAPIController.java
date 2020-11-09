package com.whu.whucisp.Controller;

import entity.Apply;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Applies")
public class ApplyRESTAPIController {
//    /**
//     * 处理"/Applies/"的GET请求，用来获取报名列表
//     *
//     * @return
//     */
//    @GetMapping("/")
//    public List<User> getUserList() {
//        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<User> r = new ArrayList<User>(users.values());
//        return r;
//    }
//
//    /**
//     * 处理"/Applies/"的POST请求，用来创建Apply
//     *
//     * @param Apply
//     * @return
//     */
//    @PostMapping("/")
//    public String postUser(@RequestBody Apply apply) {
//        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
//        users.put(user.getId(), user);
//        return "success";
//    }
//
//    /**
//     * 处理"/Applies/{schoolID}"的GET请求，用来获取url中schoolID值的Apply信息
//     *
//     * @param schoolID
//     * @return
//     */
//    @GetMapping("/{schoolID}")
//    public User getUser(@PathVariable Long schoolID) {
//        // url中的id可通过@PathVariable绑定到函数的参数中
//        return users.get(id);
//    }
//
//    /**
//     * 处理"/Applies/{schoolID}"的PUT请求，用来更新Apply信息
//     *
//     * @param schoolID
//     * @param Apply
//     * @return
//     */
//    @PutMapping("/{schoolID}")
//    public String putUser(@PathVariable Long schoolID, @RequestBody Apply apply) {
//        User u = users.get(id);
//        u.setName(user.getName());
//        u.setAge(user.getAge());
//        users.put(id, u);
//        return "success";
//    }
//
//    /**
//     * 处理"/Applies/{schoolID}"的DELETE请求，用来删除User
//     *
//     * @param schoolID
//     * @return
//     */
//    @DeleteMapping("/{schoolID}")
//    public String deleteUser(@PathVariable Long schoolID) {
//        users.remove(id);
//        return "success";
//    }
}
