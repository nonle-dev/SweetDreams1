package com.sweetdreams.dao;

import java.util.ArrayList;
import java.util.List;

import com.sweetdreams.models.User;

public class UserDAO {
   public static List<User> ls = new ArrayList<User>();
   
   
   //ham tim kiem
   public User findByUsername(String username) {
	   for(User user : ls) {
		   //nếu user bằng username truyền vào return user ngc lại null
		   if(user.getUsername().equals(username)) {
			   return user;
		   }
	   }
	   return null;
   }
   
   public int update(User user) {
	  for (int i = 0; i <ls.size(); i++) {
		  //user o vi tri i = user
		if(ls.get(i).getUsername().equals(user.getUsername())) {
			ls.set(i, user); //update vi tri i la user moi
			return i; 
		}
	}
	   return -1;
   }
   
   public int save(User user) {
	   //kiem tra user co ton tai ma khac null
	   //neu tim thay thi update 
	   if(findByUsername(user.getUsername()) != null) {
		   update(user);
	   }else {
		   ls.add(user);
	   }
	   return 1;
   }
   public int delete(String username) {
	   //tim thay username khac null thi xoa
	   User u = findByUsername(username);
	   if(u!=null) {
		   ls.remove(u);
		   return 1;
	   }
	   return 0;
   }
   
   public List<User> getAll(){
	   return ls;
   }
}
