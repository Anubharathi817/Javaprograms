package com.java;

import java.util.Scanner;

public class studentmarklist {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the marks");
		marks=sc.nextInt();
		if(marks>90 && marks<=100) {
			System.out.println("grade a");
		}else if(marks>70 && marks<=89) {
			System.out.println("grade b");
		}else if(marks>50 && marks<=69) {
				System.out.println("grade c");
		}else if(marks>30 && marks<=49) {
					System.out.println("grade d");
		}else if(marks>0 && marks<=29) {
						System.out.println("fail");
		}else {
			System.out.println("invalid");
		}
	}
	}

