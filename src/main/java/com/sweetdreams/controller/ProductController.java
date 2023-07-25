package com.sweetdreams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sweetdreams.models.Product;
import com.sweetdreams.models.User;
import com.sweetdreams.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	ProductService service;
	@GetMapping("views")
   public String viewProducts(Model model) {
		model.addAttribute("LIST_PRODUCT",service.getAll());
	   return "view-products";
   }
//	@PostMapping("/add")
//    public void addProduct(@RequestParam("name") String name, @RequestParam("price") double price) {
//		Product product = new Product();
//	    product.setName(name);
//	    product.setPrice(price);
//		service.add(product);
//    }
//	@GetMapping("/add")
//    public String addOrEdit(ModelMap model) {
//		Product product = new Product();
//		model.addAttribute("USER",product);
//		model.addAttribute("LIST_PRODUCT",service.add(product));
//   	 return "view-products";
//	}
	
}
