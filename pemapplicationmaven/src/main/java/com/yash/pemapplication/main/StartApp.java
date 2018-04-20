package com.yash.pemapplication.main;

import com.yash.pemapplication.service.PEMService;

public class StartApp {

	public static void main(String[] args) {
		PEMService pemService=new PEMService();
		pemService.showMenu();

	}

}
