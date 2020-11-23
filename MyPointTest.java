package edu3;

public class MyPointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint();
		MyPoint b = new MyPoint(-4,6);
		MyPoint c = new MyPoint(2,1);
		System.out.println(b.getX() + "\n" + c.getY());
		System.out.println(a.distance(c));
		System.out.println(b.distance(3, 3));
		System.out.println(MyPoint.distance(b, c));
	}

}
