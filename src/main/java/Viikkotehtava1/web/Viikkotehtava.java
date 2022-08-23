package Viikkotehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Viikkotehtava {
	
	@RequestMapping("index")
	@ResponseBody
	public String main() {
		return "This is the main page!";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String location(@RequestParam(name="name", required=false, defaultValue="John Doe") String name, @RequestParam(name="location", required=false, defaultValue="The Moon!") String location) {
	return "Hello " + name + " " + "location: " + location;
	}
}
