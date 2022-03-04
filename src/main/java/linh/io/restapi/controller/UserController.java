package linh.io.restapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import linh.io.restapi.model.User;

@RestController
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	
	private List<User> users = new ArrayList<User>();
	
	@PostMapping("/user")
	public User create(@RequestBody User user) {
		logger.info("Thong tin nguoi dung");
		users.add(user);
		
		return user;
	}
	
	@GetMapping("/user")
	public List<User> getAll(){
		logger.info("Hien thi thong tin nguoi dung");
		return users;
	}
}
