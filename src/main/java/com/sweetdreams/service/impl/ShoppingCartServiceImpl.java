package com.sweetdreams.service.impl;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.sweetdreams.models.CartItem;
import com.sweetdreams.service.ShoppingCartService;
@SessionScope
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
  Map<Integer,CartItem> maps=new HashMap<>();
  
  @Override
public void add(CartItem item) {
	  CartItem cartItem = maps.get(item.getProductId());
	  if(cartItem==null) {
		  maps.put(item.getProductId(),item );
	  }else {
		  cartItem.setQty(cartItem.getQty()+1);
	  }
  }
  
  @Override
public void remove(int id) {
	  maps.remove(id);
  }
  @Override
public CartItem update(int proID,int qty) {
	  CartItem cartItem = maps.get(proID);
	  cartItem.setQty(qty);
	  return cartItem;
  }
  @Override
public void clear() {
	  maps.clear();
  }
  @Override
public Collection<CartItem> getAllItems(){
	  return maps.values();
  }
  @Override
public int geCount() {
	  return maps.values().size();
  }
  @Override
public double getAmount() {
	  return maps.values().stream().mapToDouble(item -> item.getQty()*item.getPrice()).sum();
  }
  
  
  
}
