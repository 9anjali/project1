package model;

public class Student {
	
	String name;
	int id;
	
	public Student() {
		
	}
	
public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}


}
