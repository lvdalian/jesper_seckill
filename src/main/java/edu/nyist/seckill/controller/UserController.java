package edu.nyist.seckill.controller;

import edu.nyist.seckill.bean.User;
import edu.nyist.seckill.redis.RedisService;
import edu.nyist.seckill.result.Result;
import edu.nyist.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author rogers
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/info")
    @ResponseBody
    public Result<User> info(Model model, User user) {
        return Result.success(user);
    }
}