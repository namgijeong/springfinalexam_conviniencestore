package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping(value="/admin_dailycost")
	public String adminDailyCost() {
		return "admin/admin_static_dailycost";
	}
}
