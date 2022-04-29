package com.springapps_springcore.set;

import java.util.Set;

public class CarDealer {
	private String name;
	private int price;
	private String colour;
	private Set<String> model;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	
	public void setColour(String colour) {
		this.colour = colour;
	}

	public Set<String> getModel() {
		return model;
	}

	public void setModel(Set<String> model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "CarDealer [name=" + name + ", price=" + price + ", colour=" + colour + ", model=" + model + "]";
	}

	

	
}
