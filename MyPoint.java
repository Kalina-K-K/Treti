package edu3;

public class MyPoint {
	private double x=0;
	private double y=0;
	
	MyPoint(){
	}
	MyPoint(double x, double y){
		this.x=x;
		this.y=y;
	}
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	
	double distance(MyPoint point) {
		double side1 = point.x-this.x;
		double side2 = point.y-this.y;
		double distance = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
		return distance;
	}
	double distance(double x,double y) {
		double side1 = x-this.x;
		double side2 = y-this.y;
		double distance = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
		return distance;
	}
	static double distance(MyPoint p1, MyPoint p2) {
		double side1 = p1.x-p2.x;
		double side2 = p1.y-p2.y;
		double distance = Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2));
		return distance;
	}
}
