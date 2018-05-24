package com.home.core.collections;

import java.util.HashSet;
import java.util.Iterator;

class Book
{
	private int id;
	private String title;
	private String author;
	private float price;
	
	public Book(int id, String title, String author, float price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	/**@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}**/
	
	public boolean equals(Object obj){
		
		Book book=(Book)obj;
		return id==(book.id);
	}
	
	public int hashCode(){
		return id;
	}
	
	/**public int compareTo(Object o){
		
		Book book=(Book)o;
		
		return (int)id-book.id;
	}**/
	
}


public class HashSetDemo
{
		public static void main(String[] args) {
			
			HashSet mySet=new HashSet();			
			
			mySet.add("Sunday");
			mySet.add("tuesday");
			mySet.add("Monday");
			mySet.add("wednesday");
			mySet.add("tuesday");
			
		//	System.out.println(mySet);
			
			Book b1=new Book(103,"Welcome to c","yashwant", 5000);
			Book b2=new Book(102,"Welcome to java","oriley", 4000);
			Book b3=new Book(102,"Welcome to java","oriley", 4000);
			
			mySet.add(b1);
			mySet.add(b2);
			mySet.add(b3);
			
			
			Iterator it=mySet.iterator();
			while(it.hasNext()){
				
				Object obj=it.next();
				if(obj instanceof Book){
					System.out.println(obj.hashCode());
				System.out.println(obj.toString());
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}	
}
