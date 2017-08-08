package com.bosic.day.demo03;

public class Penguin extends Pet {
	private String sex;
	public Penguin(String name,String sex){
		super(name);
		this.sex=sex;
	}	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	public void print (){
		super.print();
		System.out.println("我是一只"+this.sex+"。");
	}
	public void eat() {
		if(this.getHealth()>=100){
			System.out.println("企鹅"+this.getName()+"我很饱，不需要喂食，谢谢主人");
		}else if(this.getHealth()<100){
			this.setHealth(this.getHealth()+5);
			System.out.println("企鹅"+this.getName()+"我吃饱了，健康值在增加5");
		}
	}
	public void swimming(){
		System.out.println("企鹅"+this.getName()+"正在游泳");
		this.setHealth(this.getHealth()-6);
		this.setLove(this.getLove()+3);
	}

}
