package com.te.ecom.dao;

import java.util.List;

import com.te.ecom.bean.Admin;
import com.te.ecom.bean.Item;

public interface EcomDAO {


	public Admin authenticate(Integer id, String password);
	
	public boolean addItem(Item item);
	
	public boolean removeItem(Integer id);
	
	public Item searchItem(Integer id);
	
	public List<Item> getAllItems();
	
	public boolean updateItem(Item item);

}