package com.hwrky.shop.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.hwrky.shop.entity.User;
import com.hwrky.shop.service.UserService;

@Controller
public class UserController extends BaseController {
	
    @Resource(name="userService")
    private UserService userService;
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
    	 return "login";
    }
    
    @RequestMapping(value="/dologin",method=RequestMethod.POST)
    public String doLogin( @RequestParam(value = "user_name") String user_name,
    		@RequestParam(value = "user_password") String user_password,
    		HttpSession session,
    		HttpServletRequest request,
    		Model model) {
    	User user = new User();
    	user.setUser_name(user_name);
    	user.setUser_password(user_password);
    	user = userService.getByLogin(user);
    	if(user != null) {
    		session.setAttribute("user", user);
    		return "redirect:/main";
    	}else {
    		session.setAttribute("error", "账户或密码错误");
    		return "login";
    	}
    }
    
    @RequestMapping(value="/main", method = RequestMethod.GET)
    public String domain() {
    	return "fragment";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String index(){
    	 return "register";
    }
    
    
    @RequestMapping(value = "/success", method = RequestMethod.GET)
    public String successs(){
    	 return "login";
    }
    

    //易优购前台-用户注册-ajax
    @ResponseBody
    @RequestMapping(value = "/user/useradd", method = RequestMethod.POST/*, produces = "application/json;charset=UTF-8"*/)
    public String register(
            @RequestParam(value = "user_name") String user_name  /*用户名 */,
            @RequestParam(value = "user_nickname") String user_nickname  /*用户昵称 */,
            @RequestParam(value = "user_password") String user_password  /*用户密码*/,
            @RequestParam(value = "user_gender") String user_gender  /*用户性别*/,
            @RequestParam(value = "user_birthday") String user_birthday /*用户生日*/
    ) throws ParseException {
        logger.info("验证用户名是否存在");
        
        if (userService.getTotal(new User().setUser_name(user_name)) > 0) {
            logger.info("用户名已存在，返回错误信息!");
            JSONObject object = new JSONObject();
            object.put("success", false);
            object.put("msg", "用户名已存在，请重新输入！");
            return object.toJSONString();
        }
        logger.info("创建用户对象");
        User user = new User()
                .setUser_name(user_name)
                .setUser_nickname(user_nickname)
                .setUser_password(user_password)
                .setUser_gender(Byte.valueOf(user_gender))
                .setUser_birthday(new SimpleDateFormat("yyyy-MM-dd").parse(user_birthday));
        logger.info("用户注册");
        if (userService.add(user)) {
            logger.info("注册成功");
            JSONObject object = new JSONObject();
            object.put("success", true);
            return object.toJSONString();
        } else {
            throw new RuntimeException();
        }
    }
    
    
    
}
