package com.java;
public class NoOfDigitalMain {

	public static void main(String[] args) {
		int num=23451,c=0;
		//find no of digits 
		while(num>0) {
			num=num/10;
			System.out.println(num);
			c++;
		}
		System.out.println("Number of digits="+c);
		}

	}


