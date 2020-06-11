package com.springmvcstudy.congroller;

import com.springmvcstudy.entity.User;
import com.springmvcstudy.entity.UserList;
import com.springmvcstudy.entity.UserMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/data")
public class DataBindHandler {

    @RequestMapping("/baseType")
    public String baseType (int id) {
        return id + "";
    }

    @RequestMapping("/packageType")
    public String packageType(@RequestParam(value = "num", required = false, defaultValue = "0") Integer id) {
        return id + "";
    }

    @RequestMapping("/array")
    public String array(String[] name) {
        String str = Arrays.toString(name);
        return str;
    }

    @RequestMapping("/list")
    public String list(UserList userList) {
        StringBuffer str = new StringBuffer();
        for (User user : userList.getUsers()) {
            str.append(user);
        }
        return str.toString();
    }

    @RequestMapping("/map")
    public String map(UserMap userMap) {
        StringBuffer str = new StringBuffer();
        for (String key : userMap.getUsers().keySet()) {
            User user = userMap.getUsers().get(key);
            str.append(user);
        }
        return str.toString();
    }

    @RequestMapping("/json")
    public User json(@RequestBody User user) {
        System.out.println(user);
        user.setId(6);
        user.setName("赵六");
        return user;
    }


}
