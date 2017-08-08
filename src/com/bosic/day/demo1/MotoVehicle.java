package com.bosic.day.demo1;

public abstract class MotoVehicle {
	private String no;//汽车牌子
	private String brand;//汽车品牌
	public MotoVehicle(){
		
	}
	public MotoVehicle(String no, String brand) {
		
		this.no = no;
		this.brand = brand;
	}
	public String getNo() {
		return no;
	}	
	public String getBrand() {
		return brand;
	}
	/**
	 * 抽象方法，计算汽车租赁价
	 */
	public abstract int calRent(int days);
}
