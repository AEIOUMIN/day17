package com.bosic.day.demo1;

/**
 * 客车类，继承汽车类
 *
 */
public final class Bus extends MotoVehicle{
	private int seatCount;//座位数
	public Bus(){
		
	}
	
	public Bus(int seatCount,String no,String brand) {
		super(no,brand);
		this.seatCount = seatCount;
	}
	
	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	/**
	 * 计算客车租赁价
	 */
	public int calRent(int days) {
		if(seatCount<=16){
			return days*800;
		}else {
			return days*1500;
		}		
	}
	
}
