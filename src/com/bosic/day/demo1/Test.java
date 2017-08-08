package com.bosic.day.demo1;

import java.util.Scanner;

/**
 *测试类
 */
public class Test {
	public static void main(String[] args) {
		String no,brand,type,mtype;
		int seatCount,days,rent;
		Car car;
		Bus bus;
		Scanner input =new Scanner(System.in);
		System.out.println("欢迎来到汽车租赁公司！");
		System.out.println("请输入要租赁的天数：");
		days=input.nextInt();
		System.out.print("请输入要租赁的汽车类型（1,轿车            2，客车）：");
		mtype=input.next();
		if("1".equals(mtype)){
			System.out.println("请输入要租赁的轿车品牌（1，宝马          2，别克）：");
			brand=input.next();
			System.out.println("请输入轿车的型号：");
			if("1".equals(brand)){
				System.out.print("1、550i：");
			}else{
				System.out.print("2、商务舱GL8  3、林荫大道");
			}
			type=input.next();
			no="京BK5543";
			System.out.println("分配给您的汽车牌号是:"+no);
			car =new Car(no,brand,type);
			rent=car.calRent(days);
		}else{
			System.out.print("请输入要租赁的客车品牌：（1，金杯     2，金龙）");
			brand =input.next();
			System.out.print("请输入座位数：");
			seatCount=input.nextInt();
			no="京BK8769";
			System.out.println("分配给您的汽车牌号是:" + no);
			bus=new Bus(seatCount,no,brand);
			rent=bus.calRent(days);			
		}
		System.out.println("\n顾客您好！您需要支付的租赁费用是" + rent + "。");

	}
}
