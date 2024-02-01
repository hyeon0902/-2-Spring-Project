package com.bongsamaru.login.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bongsamaru.admin.service.UserService;
import com.bongsamaru.admin.service.UserVO;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/idCheck/{memId}")
	@ResponseBody
	public Boolean idCheck(@PathVariable String memId) {
		return userService.countMemId(memId);
	}
	
	@GetMapping("/nickCheck/{memNick}")
	@ResponseBody
	public Boolean idNick(@PathVariable String memNick) {
		return userService.countMemId(memNick);
	}
	
	@PostMapping("/userSignUp")
	@ResponseBody
	public void userSignUp(@RequestBody UserVO vo) {
		System.out.println(vo);
		
		userService.insertUser(vo);
	}
	
}
