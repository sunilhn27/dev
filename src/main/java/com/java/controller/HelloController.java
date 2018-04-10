package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.Custmer.Entity.Coustmer;
import com.java.service.CoustmerService;

@Controller
public class HelloController {

	@Autowired
	private CoustmerService coustmerservice;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/list")
	public String List(Model model) {
		List<Coustmer> thecoustmer = coustmerservice.getcoustmers();
		model.addAttribute("coustmer", thecoustmer);
		return "listcoustmer";
	}

	@GetMapping("/showaddcoustmer")
	public String add(Model model) {

		Coustmer thecoustmer = new Coustmer();
		model.addAttribute("coustmer", thecoustmer);

		return "addcoustmer";
	}

	@PostMapping("/savecoustmer")
	public String save(Model model, @ModelAttribute("coustmer") Coustmer thecoustmer) {
		coustmerservice.savecoustmer(thecoustmer);
		return "redirect:listcoustmer";
	}

	@RequestMapping("/showformforupdate")
	public String update(Model model, @RequestParam("coustmerId") int id) {
		
		Coustmer thecoustmer =coustmerservice.getcoustmer(id);
		
		model.addAttribute("coustmer", thecoustmer);		
		return "coustmerform";

	}

	@PostMapping("/hello")
	public String sayHello(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";

	}

	@RequestMapping("/formpage")
	public String form() {
		return "formpage";
	}
}
