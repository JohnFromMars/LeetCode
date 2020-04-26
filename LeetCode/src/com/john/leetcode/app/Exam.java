package com.john.leetcode.app;

public class Exam {
	int x = 200;
	static{
		int x = 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(test(1));
		System.out.println("Hello World!");
		String s = run("11");
		System.out.println(s);
		
	}

	public static int test (int x){
		x = x & 0xff;
		int y = 1;
		y = ~y;
		System.out.println(y);
		x = x|y;
		return x;
	}
	
	public static String run(String s){
		try{
			s.substring(1);
			System.out.println(2);
			throw new RuntimeException("1");
		}finally{
			System.out.println(1);
		}
	}
}
