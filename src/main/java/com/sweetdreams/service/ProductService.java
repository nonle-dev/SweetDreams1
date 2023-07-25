package com.sweetdreams.service;

import java.util.List;

import com.sweetdreams.models.Product;

public interface ProductService {
     public int add(Product p);
     public int remove(int id);
     public List<Product> getAll();
     public Product findProductByID(int id);
}
