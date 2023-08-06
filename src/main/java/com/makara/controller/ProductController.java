package com.makara.controller;

import java.text.DecimalFormat;
import java.util.*;

import org.hibernate.annotations.ParamDef;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.makara.logic.ProductLogic;
import com.makara.logic.ProductType;
import com.makara.model.Product;

@Controller
public class ProductController {

	@GetMapping("/")
	public String index(Model model) {

		List<Product> productList = ProductLogic.getProducts();
		List<Product> drinks = ProductLogic.getProductsByType(ProductType.DRINK);
		List<Product> vegetables = ProductLogic.getProductsByType(ProductType.VEGETABLE);
		List<Product> other = ProductLogic.getProductsByType(ProductType.OTHER);

		// Map product count to each product type
		HashMap<Enum, Integer> map = ProductLogic.mapProductCount(drinks, vegetables, other);

		model.addAttribute("productTypeCount", map);
		model.addAttribute("products", productList);
		model.addAttribute("drinks", drinks);
		model.addAttribute("vegetables", vegetables);
		model.addAttribute("productTypes", ProductType.values());
		return "index";
	}
}
