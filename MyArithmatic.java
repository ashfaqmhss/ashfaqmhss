package com.ashfaq.mhss;

public class MyArithmatic {
	double no1,no2,no3;
	public double add(double n1,double n2,double n3)
	{
		return n1+n2+n3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArithmatic m=new MyArithmatic();
		double s=m.add(12,34,56);
		System.out.println("add="+s);
		
		
	}

}
