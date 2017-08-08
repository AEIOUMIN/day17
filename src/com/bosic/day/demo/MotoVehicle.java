package com.bosic.day.demo;

public  abstract class MotoVehicle {
	private String no="京12455";
	private String brand;	
	private double money;
	private int day;
	public MotoVehicle(){
		
	}
	public MotoVehicle(int day) {
		this.day=day;
	}
	public MotoVehicle(String no, String brand, double money,int day) {
	
		this.no = no;
		this.brand = brand;		
		this.money=money;
		this.day=day;
		
	}
	public String getNo() {
		return no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public void daysMoney(){
		int day = getDay();
		double money=getMoney();
		System.out.println("顾客您好！您租赁的天数是"+getDay()+"天 ");
		System.out.println("牌照是"+getNo());
		System.out.println("您需要支付的租金是："+day*money);
	}
}
