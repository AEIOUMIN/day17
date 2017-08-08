package com.bosic.day.demo03;

public abstract class Pet {
	private String name="无名氏";
	private int health;
	private int love;
	public Pet(){
		
	}
	public Pet(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public abstract void eat();
	public void print(){
		System.out.println("宠物的自白：\n我的名字是"+this.getName()+"我的健康值是"+this.getHealth()+"我与主人的亲密度是"+this.love+"。");
	}
}
