package com.ninja.training;

public class DemoMethod {

	public static void main(String[] args) {
		DemoMethod obj = new DemoMethod();	
		int n1 = 10, n2 = 40;
		int n = obj.addInt(10, 40);
		System.out.println(n1 +  " + " + n2 + " = "  + n);
		
		int t3 = obj.addInt(12,56,78 );
		System.out.println("Addition of 3 int: " + t3);

		
	}
	
	//Method to add 2 integers
	public int addInt(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}
	
	//Method to add 3 integers
	public int addInt(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		return total;
	}
	public float addfloat(float num1, float num2) {
		float total = num1 + num2;
		return total;
	}

}
