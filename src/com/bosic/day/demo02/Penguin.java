package com.bosic.day.demo02;

/**
 * 企鹅类，宠物类的子类
 */
public class Penguin extends Pet{
	private String sex;//性别
	/**
	 * @param name 昵称
	 * @param sex 性别
	 */
	public Penguin(String name,String sex){
		super(name);
		this.sex=sex;
	}
	public String  getsex(){
		return sex;
	}
	
	/**
	 * 重写print方法
	 */
	public void print(){
		super.print();
		System.out.println("性别是"+this.sex+"。");
	}
	/**
	 * 实现吃的方法
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("企鹅"+this.getName()+"吃饱了，不需要喂食了");
		}else{
			this.setHealth(this.getHealth()+5);
			System.out.println("企鹅"+this.getName()+"吃饱啦，健康值增加5");
		}
		
	}
	public void swimming(){
		System.out.println("企鹅"+this.getName()+"正在游泳");
		this.setHealth(this.getHealth()-6);
		this.setLove(this.getLove()+3);
	}
}
