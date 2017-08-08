package com.bosic.day.demo02;

/**
 * 领养宠物并喂食
 */
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("欧欧","雪娜瑞");	
		dog.setHealth(80);
		dog.print();
		Penguin penguin = new Penguin("楠楠", "Q妹");
		Master master = new Master("王先生", 100);
		master.feed(dog);
		master.feed(penguin);
		penguin.setHealth(80);
		penguin.print();
		master.feed(penguin);
	}
}
