package home.controller;

import home.service.CarService;
import home.service.HistoryService;
import home.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	@Qualifier("carService")
	private CarService carService;
	
	@Autowired
	@Qualifier("userService")
	private UserService userService;
	
	@Autowired
	@Qualifier("historyService")
	private HistoryService historyService;
	

}
