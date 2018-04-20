package com.yash.pemapplication.dao;

import java.util.ArrayList;
import java.util.List;

import com.yash.pemapplication.domain.Category;
import com.yash.pemapplication.domain.Expense;



public class Repository {

	public List<Expense> expList=new ArrayList<Expense>();;
	public List<Category> catList=new ArrayList<Category>();
	private static Repository repository;
	private Repository() {
		catList.add(new Category("Electric Bill"));
		catList.add(new Category("Rent"));		
	}
	
	public static Repository getRepository(){
		if(repository==null){
			repository=new Repository();
		}
		
		return repository;
	}
		
}
