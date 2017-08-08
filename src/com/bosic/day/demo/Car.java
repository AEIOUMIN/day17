package com.bosic.day.demo;

public final class Car extends MotoVehicle{
	private int type;
	public Car(){
		
	}
	public Car(int type,int day) {
		super(day);
		this.type=type;
	}
	public int getType() {
		return type;
	}

	public void setType(int  type) {
		if(type==1){			
			super.setMoney(600);
			System.out.println("您选择的品牌是：别克商务舱GL8,价格是："+getMoney()+"每天");			
		}else if(type==2){			
			super.setMoney(500);
			System.out.println("您选择的品牌是：宝马550i,价格是："+getMoney()+"每天");			
		}else if(type==3) {			
			super.setMoney(300);
			System.out.println("您选择的品牌是：别克林荫大道，价格是："+getMoney()+"每天");
		}else{
			System.out.println("输入错误！");
		}
		
	}
	
}
