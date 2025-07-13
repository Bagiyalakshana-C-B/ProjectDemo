package com.bootproject.projectdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProjectdemoController {
	
	@RequestMapping("/home")
		public String indexbyjsp() {
			return "index";
		}
		/*public String indexbyhtml() {
			return "redirect:/index.html";
		}
	*/
}
