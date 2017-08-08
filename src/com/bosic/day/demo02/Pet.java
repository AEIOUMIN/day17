package com.bosic.day.demo02;

/**
 *宠物类，狗狗和企鹅的父类
 */
public abstract class Pet {
	private String name="无名氏";//昵称
	private int health=100;//健康值
	private int love=0;//爱心值
	public Pet(){
		
	}
	public Pet(String name){
		this.name=name;
	}
	/**
	 * 抽象方法eat，负责宠物吃饭功能
	 * @return
	 */
	public abstract void eat();
	/**
	 * 输出宠物信息
	 * @return
	 */
	public void print(){
		System.out.println("宠物的自白：\n我的名字叫："+this.name+"，健康值是"+health+",爱心值是"+this.love+"。");
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
	
}
