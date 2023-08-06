package com.makara.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/checkout")
	public String checkout() {
		return "checkout";
	}

	@GetMapping("/cart")
	public String cart() {
		return "cart";
	}

	@GetMapping("/shop")
	public String shop() {
		return "shop";
	}

	@GetMapping("/product-details")
	public String productDetails() {
		return "product-details";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact-us";
	}

	@GetMapping("/blog")
	public String blog() {
		return "blog";
	}

	@GetMapping("/blog-single")
	public String blogSingle() {
		return "blog-single";
	}

	@GetMapping("/404")
	public String notFound() {
		return "404";
	}

}
