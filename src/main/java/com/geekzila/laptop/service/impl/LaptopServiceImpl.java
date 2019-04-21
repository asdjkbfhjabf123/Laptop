package com.geekzila.laptop.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.laptop.model.Laptop;
import com.geekzila.laptop.service.LaptopService;

public class LaptopServiceImpl implements LaptopService {

	public List<Laptop> laptops = new ArrayList<Laptop>();

	public LaptopServiceImpl() {
		laptops.add(new Laptop("Rakesh"));
		laptops.add(new Laptop("Aruv"));
	}

	public void add(Laptop laptop) {
		// TODO Auto-generated method stub
		laptops.add(laptop);
		
	}

	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		return laptops;
	}

}
