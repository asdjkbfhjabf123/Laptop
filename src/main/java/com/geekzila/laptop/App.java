package com.geekzila.laptop;

import java.util.List;

import com.geekzila.laptop.model.Laptop;
import com.geekzila.laptop.service.LaptopService;
import com.geekzila.laptop.service.impl.LaptopServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LaptopService laptopService = new LaptopServiceImpl();
		List<Laptop> laptops = new laptopService.findAll();

		for (int i = 0; i < laptops.size(); i++) {
			Laptop laptop = laptops.get(i);
			System.out.println("Name: " + laptop.getBrand());
		}
	}
}
