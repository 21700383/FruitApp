package com.fruitapp;

import java.util.Comparator;

public class Fruit {
	private int no;
	private String name;
	private int price;
	

	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	static class FruitComparator implements Comparator<Fruit>{
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o1.name.compareTo(o2.name);
		}
	}
	
	static class FruitComparatorDesc implements Comparator<Fruit>{
		@Override
		public int compare(Fruit o1, Fruit o2) {
			return o2.name.compareTo(o1.name);
		}
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
}
