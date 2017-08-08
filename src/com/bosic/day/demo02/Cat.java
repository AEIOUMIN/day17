package com.bosic.day.demo02;

public class Cat extends Pet{
	private String color;
	public Cat(String name,String color){
		super(name);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public  void print(){
		super.print();
		System.out.println("我是一只"+this.getName()+"。");
	}
	public void eat() {		
		
	}
	
}
