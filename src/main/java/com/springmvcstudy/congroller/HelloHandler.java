package com.springmvcstudy.congroller;

import com.springmvcstudy.entity.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloHandler {

    @RequestMapping(value = "/index", method = RequestMethod.GET, params = {"name", "id"})
    public String index(@RequestParam("name") String str, @RequestParam("id") int age) {
        System.out.println("age:" + age + ",str:" + str);
        System.out.println("执行了index...");
        return "index";
    }

    @RequestMapping(value = "/rest/{name}/{id}")
    public String rest(@PathVariable("name") String name, @PathVariable("id") int id) {
        System.out.println("name:" + name + ",id:" + id);
        return "index";
    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue(value = "JSESSIONID") String sessionID) {
        System.out.println(sessionID);
        return "index";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(User user) {
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/forward")
    public String forward() {
        return "forward:/index.jsp";
//        return "index";
    }

    @RequestMapping("/redirect")
    public String redirect() {
        return "redirect:/index.jsp";
    }
}
