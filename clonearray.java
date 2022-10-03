package com.java;

public class clonearray {

	public static void main(String[] args) {
		int intArray[]= {0,1,2,3,4,5,6,7,8,9};
		int clonearray[]=intArray.clone();
		for(int i=0;i<clonearray.length;i++) {
			System.out.println(clonearray[i]+"");
		}
	}

}
