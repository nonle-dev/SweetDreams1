package com.sweetdreams.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sweetdreams.models.Product;
import com.sweetdreams.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	public static List<Product> ls = new ArrayList<>();
	 static {
	    	ls.add(new Product (1, "Gấu bông","Gấu bông trắng có nơ","", 540000,new Date(),false,""));
	    	ls.add(new Product (2, "Gấu bông","Gấu dâu ","", 578000,new Date(),false,""));
	    	ls.add(new Product (3, "Gấu bông","Gấu bông 7 màu","", 345000,new Date(),false,""));
	    	ls.add(new Product (4, "Gối chống lạnh","Gối chườm  ấm bàn tay Kazata","", 145000,new Date(),false,""));
	    	ls.add(new Product (5, "Gối chống lạnh","Gối giữ ấm cơ thể","", 110000,new Date(),false,""));
	    	ls.add(new Product (6, "Gối chống lạnh","Gối giữ chống lạnh  ","", 250000,new Date(),false,""));
	    	ls.add(new Product (7, "Gối ngủ văn phòng","Gối tựa đầu hiệu Everon","", 400000,new Date(),false,""));
	    	ls.add(new Product (8, "Gối ngủ văn phòng","Gối chữ U hình gấu","", 359000,new Date(),false,""));
	    	ls.add(new Product (9, "Gối ngủ văn phòng","Gối ngủ văn phòng êm, dịu nhẹ","", 119000,new Date(),false,""));
	    	ls.add(new Product (7, "Bịt mắt ngủ","Bịt mắt ngủ hình gấu trúc","", 200000,new Date(),false,""));
	    	ls.add(new Product (8, "Bịt mắt ngủ","Bịt mắt ngủ hình mặt cười","", 150000,new Date(),false,""));
	    	ls.add(new Product (9, "Bịt mắt ngủ","Bịt mắt Louis Vuitton làm từ lông chồn siêu mềm mại","", 26000000,new Date(),false,""));
	    }

		/*
		 * public int add(Product p) { // TODO Auto-generated method stub return 0; }
		 */
	  
	@Override
	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return ls;
	}
	@Override
	public Product findProductByID(int id) {
		// TODO Auto-generated method stub
		for (Product product : ls) {
			if (product.getId()==id) {
				return product;
			}
		}
		return null;
	}
	@Override
	public int add(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}
	 
	

}
