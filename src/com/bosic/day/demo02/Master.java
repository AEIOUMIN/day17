package com.bosic.day.demo02;

/**
 * 主人类
 */
public class Master {
	private String name="";//主人名字
	private int money=0;//元宝数
	/**
	 * 有参构造方法
	 * @param name 主人名字
	 * @param money 元宝数
	 */
	public Master(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	/**
	 * 主人给宠物喂食
	 */
	public void feed(Pet pet){
		pet.eat();
	}
	public Pet getPet(int typeId){
		
		if(typeId==1){
			return new Dog("欧欧","雪娜瑞");
		}else if(typeId==2){
			return new Penguin("楠楠","Q妹");
		}
		return null;
	}
	public void play(Pet pet){
		if(pet instanceof Dog){
			Dog dog = (Dog)pet;
			dog.catchingFlyDisc();
			dog.print();
		}else if(pet instanceof Penguin){
			Penguin pgn = (Penguin)pet;
			pgn.swimming();
			pgn.print();
		}
	}
}
