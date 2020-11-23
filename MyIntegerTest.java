package edu3;

public class MyIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "123";
		char[] chars = {'2','4','6'};
		MyInteger num = new MyInteger(17);
		MyInteger num2 = new MyInteger(24);
//		System.out.println(num.getValue() + "\n" + num.isEven() + "\n" + num.isOdd() + "\n" + num.isPrime());
//		System.out.println(num.equals(23) + "\n" + num.equals(17));
		System.out.println(num.equals(num2) + "\n" + num.equals(10) + "\n" + MyInteger.isPrime(num2));
		System.out.println(MyInteger.parseInt(chars) + "\n" + MyInteger.parseInt(string));
		System.out.println(MyInteger.isEven(num2));
	}

}
