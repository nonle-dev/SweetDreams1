package com.sweetdreams.service;

import java.util.Collection;

import com.sweetdreams.models.CartItem;

public interface ShoppingCartService {
	//dinh nghia cac ham
	double getAmount();

	int geCount();

	Collection<CartItem> getAllItems();

	void clear();

	CartItem update(int proID, int qty);

	void remove(int id);

	void add(CartItem item);
      
	
}
