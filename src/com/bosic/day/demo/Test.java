package com.bosic.day.demo;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int day = 0;
		Car car = new Car();
		Bus bus =new Bus();
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("欢迎您来到汽车租赁公司！");
		System.out.print("请选择您想要的车类型的编号(1,汽车 2，客车):");
		num = input.nextInt();
		switch (num) {
		case 1:
			System.out.print("请输入您想要的品牌 的编号(1,别克商务舱GL8 2,宝马550i 3,别克林荫大道):");
			num = input.nextInt();
			System.out.print("请输入您想要租赁的天数：");
			day = input.nextInt();
			car.setDay(day);
			car.setType(num);		
			car.daysMoney();
			break;
		case 2:
			System.out.println("请输入您想要的客车的乘数(1，小于等于16座  2，大于16座):");
			num = input.nextInt();
			System.out.print("请输入您想要租赁的天数：");
			day = input.nextInt();
			bus.setSeatCount(num);
			bus.setDay(day);
			bus.daysMoney();			
			break;
		}

	}
}
