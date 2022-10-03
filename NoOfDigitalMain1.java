package com.java;

public class NoOfDigitalMain1 {

	public static void main(String[] args) {
			int num=23451,c=0;
			//find no of digits 
			int d;
			while(num>0) {
				d=num%10;
				System.out.println("d=num%10 digit="+d);
				num=num/10;
				System.out.println("num=num/10"+num);
				c++;
			}
			System.out.println("Number of digits="+c);
			

	}

}
