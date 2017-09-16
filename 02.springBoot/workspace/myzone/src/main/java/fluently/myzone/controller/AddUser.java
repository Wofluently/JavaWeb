package fluently.myzone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user") 
public class AddUser {
	
	@RequestMapping(value="/add", method = RequestMethod.GET) 
	public String addUser(){
		return "Add User";
	}
}