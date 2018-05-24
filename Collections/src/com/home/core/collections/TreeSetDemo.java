package com.home.core.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class SortByPrice implements Comparator
{
	


	@Override
	public int compare(Object o1, Object o2) {
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return (int)(b1.getPrice()-b2.getPrice());
	}
}

class SortById implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return b1.getId()-b2.getId();
	}
	
}

class SortByTitle implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Book b1=(Book)o1;
		Book b2=(Book)o2;
		return b1.getTitle().compareTo(b2.getTitle());
	}
	
}

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//TreeSet names=new TreeSet(new SortByPrice());
		//TreeSet names=new TreeSet(new SortById());
		
		TreeSet names=new TreeSet(new SortByTitle());
		
		/**names.add("Eric");
		names.add("Ram");
		names.add("Adi");
		names.add("vibhanshu");**/
		
		Book b1=new Book(101,"Welcome to c","yashwant", 5000);
		Book b2=new Book(102,"Welcome to java","oriley", 4000);
		Book b3=new Book(103,"Welcome to java","oriley", 4050);
		
		names.add(b1);
		names.add(b2);
		names.add(b3);
		
		Iterator it=names.iterator();
		
		while(it.hasNext()){
			
			Object obj=it.next();
			
			if(obj instanceof Book)
			System.out.println(obj);
		}
		
		
	}

}
