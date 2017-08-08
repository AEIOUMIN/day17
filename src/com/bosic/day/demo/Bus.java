package com.bosic.day.demo;

public final class Bus extends MotoVehicle{
	private int  seatCount;
	public Bus(){
		
	}
	public Bus(int seatCount,int day) {
		super(day);
		this.seatCount = seatCount;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		if(seatCount==1){			
			super.setMoney(800);
			System.out.println("您选择的客车的是：小于等于16座的车，价格是："+getMoney()+"每天");
		}else if(seatCount==2){			
			super.setMoney(1500);
			System.out.println("您选择的客车的是：大于16座的车，价格是："+getMoney()+"每天");
		}else{
			System.out.println("输入错误！");
		}
		
	}	
}
