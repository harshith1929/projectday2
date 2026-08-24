package day_4_;

import java.util.ArrayList;

public class array_list {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("Initial size of array before adding elements " + list.size());
		System.out.println("Arraylist is empty before adding elements: "+ list.isEmpty());
		System.out.println("Contents of Arraylist before adding values: "+ list);
		
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("D");		
		list.add("F");
		
		list.add("A");

		list.add(null);
		
		System.out.println("Size of arraylist after adding elements: " + list.size());
		System.out.println("Array list is emoty after adding values: "+ list.isEmpty());
		System.out.println("Contents of Arraylist after adding values: "+ list);
		
		boolean b1= list.contains("E");
		System.out.println("Value E is present "+ b1);
		boolean b2= list.contains("R");
		System.out.println("Value R is present "+ b2);
		
		list.remove("B");
		System.out.println("Size of ArrayList after deletion: " + list.size());
		System.out.println("contents of Array list after deletion " + list);
		
		list.clear();
		System.out.println("Size of ArrayList after clearing: "+ list.size());
		System.out.println("Size of ArrayList after clearing: "+ list);


		




	}
}