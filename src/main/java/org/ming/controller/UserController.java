package org.ming.controller;

import java.util.Calendar;

import org.ming.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping(value = "/user/{userid}", method = RequestMethod.GET)
	public @ResponseBody User queryUser(@PathVariable("userid") long userID) {

		Calendar d = Calendar.getInstance();

		d.set(1987, 12, 9);

		User u = new User();

		u.setUserID(userID);

		u.setUserName("zhaoyang");

		u.setBirth(d.getTime());

		return u;

	}
}
