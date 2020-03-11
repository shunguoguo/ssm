package com.example.demo.controller;



import java.util.ArrayList;

// 
//
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import org.springframework.web.bind.annotation.RestController;
//
///**
//
// * Controller demo
//
// * @author xcbeyond
//
// * 2018年7月5日下午11:22:49
//
// */
//
// 
////
//@RestController
//
//public class UserController {
//
// 
//
//	@RequestMapping("/print")
//
//	public String print() {
//
//		return "hello SpringBoot!";
//
//	}
//
//}


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
//
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;


@Controller

//@RequestMapping()

public class UserController {

//依赖注入

@Autowired

UserService userService;
//
//
//
@RequestMapping(value = "getAll")//method 不写的话，默认GET、POST都支持，根据前端方式自动适应

/*@GetMapping("getAll")//@GetMapping是一个组合注解，是@RequestMapping(method = RequestMethod.GET)的缩写。

@PostMapping("getAll")//@PostMapping是一个组合注解，是@RequestMapping(method = RequestMethod.POST)的缩写。*/

@ResponseBody

public List<User> getAll() {

//调用dao层

List<User> all = userService.getAll();

System.out.println(all);

return all;

}



@RequestMapping("/dept")
@ResponseBody
public ModelAndView  login4(HttpServletRequest request,HttpServletResponse response
		,HttpSession session,Model model) {
	ModelAndView modelandview = new ModelAndView();
	
	List<User> userlist = userService.getAll();
	
	modelandview.addObject("UserList", userlist);
	
	modelandview.setViewName("views/dept/dept");
	
return modelandview;

}



@RequestMapping("tologin")	
public String tologin(){
	return "views/login/login";	
//	return "views/index";	
	}
//登录验证
@RequestMapping("/login")	
public String  login(@RequestParam("username") String username,	@RequestParam("password") String password,Model model){	
	User user = new User();	
	user.setUsername(username);	
	user.setPassworld(password);
	System.out.print(password);
	System.out.print(username);
	System.out.print("username");
	if(userService.logincheck(user) != null){	
		model.addAttribute("username",username);
		model.addAttribute("password",password);
		return "views/dept/dept";
		}	
	else{	
//		model.addAttribute("error","账号或密码错误");
		return "views/erro/erro";	   
		}	
	}
//转向注册页面
@RequestMapping("toregister")
public String toregister(){		
	return "views/registe/register";	
	}
//注册	
@RequestMapping("register")	
public String  register(@RequestParam("username") String username,@RequestParam("password") String password){	
	User user = new User();	
	user.setUsername(username);	
	user.setPassword(password);
	userService.register(user);	
	return "views/login/login";    
	}

@RequestMapping("/updatePage/{id}")
public String updatePage(Model model,@PathVariable("id") int id){
    User user = userService.findUserById(id);
    model.addAttribute("user",user);
    return "views/update/updatePage";
}

//@PostMapping("/update")
@RequestMapping("/update")
public String updateUser(Model model,User user,HttpServletRequest request){
    String id = request.getParameter("id");
    User userById = userService.findUserById(Integer.parseInt(id));
    userService.update(user);
    System.out.println(user);
    return "redirect:/dept";
}



@RequestMapping("/insertPage")
public String index(){
    return "views/insertPage/insertPage";
}


@RequestMapping("/insert")
public String insert(User user){
    userService.register(user);
    return "redirect:/dept";
}
@RequestMapping("/delete/{id}")
public String delete(@PathVariable Integer id){
    userService.delete(id);
    return "redirect:/dept";
}

}



