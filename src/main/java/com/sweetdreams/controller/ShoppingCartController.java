package com.sweetdreams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sweetdreams.models.CartItem;
import com.sweetdreams.models.Product;
import com.sweetdreams.service.ProductService;
import com.sweetdreams.service.ShoppingCartService;

@Controller
@RequestMapping("shopping-cart")

public class ShoppingCartController {
	@Autowired
	ProductService productService;
	@Autowired
	ShoppingCartService cartService;

	@GetMapping("views")
	public String viewCarts(Model model) {
		model.addAttribute("CART_ITEMS", cartService.getAllItems());
		model.addAttribute("TOTAL", cartService.getAmount());
		return "cart-item";
	}

	@GetMapping("add/{id}")
	public String addCart(@PathVariable("id") Integer id) {
		Product product = productService.findProductByID(id);
		if (product != null) {
			CartItem item = new CartItem();
			item.setProductId(product.getId());
			item.setName(product.getName());
			item.setName(product.getNameproduct());
			item.setPrice(product.getPrice());
			item.setQty(1);
			cartService.add(item);
		}
		return "redirect:/shopping-cart/views";
	}

	@GetMapping("clear")
	public String clearCart() {
		cartService.clear();
		return "redirect:/shopping-cart/views";
	}

	@GetMapping("del/{id}")
	public String clearCart(@PathVariable("id") Integer id) {
		cartService.remove(id);
		return "redirect:/shopping-cart/views";
	}
	
    @PostMapping("update")
	public String update(@RequestParam("id")Integer id,@RequestParam("qty")Integer qty) {
		cartService.update(id, qty);
    	return "redirect:/shopping-cart/views";
	}
    
}
