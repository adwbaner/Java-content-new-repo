package com.home.core.collections;
import java.util.ArrayList;


 class Student{
	int id;
	private String name;
	long sal;
	
	public Student() {
		super();
	}
	
	
	
	public Student(int id, String name, long sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
	
}




public class ArrayListDemo {
	public static void main(String[] args) {
		
	
	
	ArrayList myList =new ArrayList();
	
	myList.add("Sunday");
	myList.add("monday");
	myList.add("tuesday");
	myList.add("wednesday");
	myList.add(new Student(101,"rocky",5000));
	//System.out.println(myList);
	
	for(int i=0;i<myList.size();i++){
		
		Object obj=myList.get(i);
		if (obj instanceof String){
			
			System.out.println(obj);
			//Student emp=(Student)obj;
			//System.out.println(emp);
		}
		
	}
	
	
	
	}	
}
