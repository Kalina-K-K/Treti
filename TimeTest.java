package edu3;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1=new Time();
		Time t2=new Time(555550000);
		Time t3= new Time(16, 17, 18);
		
		t3.setTime(555550000);
		
		System.out.println(t1.getHour()+":"+t1.getMin()+":"+t1.getSec());
		System.out.println(t3.getHour()+":"+t3.getMin()+":"+t3.getSec());
		System.out.println(t2.getHour()+":"+t2.getMin()+":"+t2.getSec());
	}

}
