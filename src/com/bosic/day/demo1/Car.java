package com.bosic.day.demo1;

/**
 *轿车类，继承汽车类
 */
public final class Car extends MotoVehicle{
	private String type;
	public Car(){
		
	}
	
	public Car(String type,String no,String brand) {
		super(no,brand);
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 计算轿车的租赁价
	 */
	public int calRent(int days) {
		if("1".equals(type)){
			return days*600;
		}else if("2".equals(type)){
			return days*500;
		}else{
			return days*300;
		}		
	}
	
}
