package chapter3;

public class CodePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting = "Hello";
		int n = greeting.length();
		System.out.println("greeting's length = "+n);
		
		
		int codePointCount = greeting.codePointCount(0,greeting.length());
		char first = greeting.charAt(0);
		char last = greeting.charAt(greeting.length()-1);
		//码点
		System.out.println(codePointCount);
		System.out.println("first:"+first);
		System.out.println("last:"+last);
		
	}

}
