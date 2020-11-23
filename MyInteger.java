package edu3;

public class MyInteger {
	int value;
	
	MyInteger(int value){
		this.value=value;
	}
	int getValue() {
		return value;
	}
	boolean isEven() {
		if(value%2==0) {
			return true;
		}else {
			return false;
		}
	}
	boolean isOdd() {
		if(value%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	boolean isPrime() {
		boolean isPrime=true;
		int maxDivider = (int)Math.ceil(Math.sqrt(value));	
		
		for(int i=2;i<=maxDivider;i++) {
			if(value%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
	}
	static boolean isOdd(int num) {
		if(num%2!=0) {
			return true;
		}else {
			return false;
		}
	}
	static boolean isPrime(int num) {
		boolean isPrime=true;
		int maxDivider = (int)Math.ceil(Math.sqrt(num));	
		
		for(int i=2;i<=maxDivider;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	static boolean isEven(MyInteger num) {
			return num.isEven();
	}
	static boolean isOdd(MyInteger num) {
		return num.isOdd();
		}
	static boolean isPrime(MyInteger num) {
		return num.isPrime();
	}
	
	boolean equals(int num) {
		if(value==num) {
			return true;
		}else {
			return false;
		}
	}
	boolean equals(MyInteger num) {
		if(num.value==this.value) {
			return true;
		}else {
			return false;
		}
	}
	
	static int parseInt(char[] chars) {
		int sum=Integer.parseInt(new String(chars));
		return sum;
	}
	static int parseInt(String string) {
		return Integer.parseInt(string);
	}
}
