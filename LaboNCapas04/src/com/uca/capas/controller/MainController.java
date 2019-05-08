package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;


@Controller
public class MainController {

	//Central controller
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.setViewName("main");
		mav.addObject("product",product);
		return mav;
	}
	
	@RequestMapping("/formData")
	@ResponseBody
	public ModelAndView form(@Valid @ModelAttribute Product product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("main"); 
		}else {
		mav.setViewName("result");
		mav.addObject("message", "Product was inserted successfully");
		}
		return mav;
	}
	
}