package com.bosic.day.demo03;

public class Dog extends Pet{
	private String strain;//品种
	public Dog(){
		
	}
	public Dog(String name,String strain){
		super(name);
		this.strain=strain;
	}
	
	public String getStrain() {
		return strain;
	}
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public void print(){
		super.print();
		System.out.println("我是一只"+this.strain+"。");
	}
	public void eat() {
		if(this.getHealth()>=100){
			System.out.println("狗狗"+this.getName()+"我很饱，不需要喂食，谢谢主人");
		}else if(this.getHealth()<100){
			this.setHealth(this.getHealth()+3);
			System.out.println("狗狗"+this.getName()+"我吃饱了，健康值在增加3");
		}
	}
	public void catchingFlyDisc(){		
			System.out.println("狗狗"+this.getName()+"正在玩飞盘");
			this.setHealth(this.getHealth()-10);
			this.setLove(this.getLove()+5);
		
	}

}
