package com.labeee.testMetmod;
import java.util.*;

public class TestMetmod {
	public static void main(String[] arges) {
		Scanner sc = new Scanner(System.in);
		System.out.println("กรอกตัวเลขตัวที่1");
		int a = sc.nextInt();
		System.out.println("กรอกตัวเลขตัวที่สอง");
		int b = sc.nextInt();
		
		System.out.println("ผลรวม:" +plus(a,b));
		equid();
	}
	public static int plus(int a,int b) {
		
		return a+b;
	}
	public static void equid() {
		int a=5,b=10;
		int x= a-b;
		System.out.println("ผลรวม:"+x);
	}
}
