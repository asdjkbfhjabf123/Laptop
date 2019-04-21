package com.geekzila.laptop.service;

import java.util.List;

import com.geekzila.laptop.model.Laptop;

public interface LaptopService {

	public void add(Laptop laptop);

	public List<Laptop> findAll();
	
}
