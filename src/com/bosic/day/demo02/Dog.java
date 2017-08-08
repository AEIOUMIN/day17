package com.bosic.day.demo02;
/**
 * 狗狗类，宠物的子类
 */
public class Dog extends Pet{
	private String strain;//品种
	/**
	 * 有参构造方法
	 * @param name 昵称
	 * @param strain 品种
	 */
	public Dog(String name, String strain){
		super(name);
		this.strain=strain;
		
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	/**
	 * 重写父类的print方法
	 */
	public void print(){
		super.print();
		System.out.println("我是一只"+this.strain+"。");
		
	}
	public void eat() {
		if(getHealth()>=100){
			System.out.println("狗狗"+this.getName()+"吃饱了，不需要喂食了！");
		}else{
			this.setHealth(this.getHealth()+3);
			System.out.println("狗狗"+this.getName()+"吃饱了，健康值增加3。");
		}
		
	}
	public void catchingFlyDisc(){
		System.out.println("狗狗"+this.getName()+"正在接飞盘");
		this.setHealth(this.getHealth()-10);
		this.setLove(this.getLove()+5);
	}
	
}
