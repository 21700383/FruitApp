package com.fruitapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fruitapp.Fruit.FruitComparator;
import com.fruitapp.Fruit.FruitComparatorDesc;

public class Main {

	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		Fruit f1 = new Fruit(1, "Apple", 1000);
		fl.add(f1);
		fl.add(new Fruit(2,"Grape",2000));
		fl.add(new Fruit(3,"Orange",1500));
		fl.add(new Fruit(4,"Grapefruit",2800));
		fl.add(new Fruit(5,"Mango",3000));
		fl.add(new Fruit(6,"Plum",2500));
		fl.add(new Fruit(7,"Peach",2400));
		fl.add(new Fruit(8,"Pomegranate",3500));
		fl.add(new Fruit(9,"Shine Musket",4000));
		fl.add(new Fruit(10,"Pear",1800));
		
		
		
		System.out.println("Fruit list (ordered by name)");
		Collections.sort(fl, new FruitComparator()); // sort, print 10 names
		for (Fruit f: fl) {
			System.out.println(f.toString());
		}
		
		System.out.println("Student list (reverse ordered by name)");
		Collections.sort(fl, new FruitComparatorDesc()); // sort in descending order
		for (int i = 0; i < fl.size(); i ++) {
			System.out.println(fl.get(i).toString());
		}
	}

}
