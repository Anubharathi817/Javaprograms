package com.java;
class StringOverload{
	void check(String str,char ch) {
		int charcount=0;
		for(int i=0;i<str.length();i++) {
			char ch1=str.charAt(i);
			if(ch1==ch) {
				charcount++;
				
			}
		}
		System.out.println("no of "+ch+" present " +charcount+" times");
				
	}
	void check(String str) {
		String s=str.toLowerCase();
		System.out.println("vowels presnt in a string");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(ch+",");
				
			}
	}
}
	public void reversestr(String s) {
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(s.charAt(i));
		}
	}

public class Functionoverload {

	public static void main(String[] args) {
		StringOverload ob=new StringOverload();
		ob.check("success",'s');
		ob.check("edubridgeindia"); 
		ob.reversestr("computer");
	
	}
	

	}

}
