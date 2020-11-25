package edu3;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account16[] acc = new Account16[10];
		for(int i=0; i<10; i++) {
			acc[i] = new Account16(i,100);
		}
		int id;
		double withdraw;
		double deposit;
		int step;
		for(int i=0; i>=0;i++) {
		System.out.println("Enter an id: ");
		id=sc.nextInt();
		if(id<0||id>9) {
			System.out.println("Wrong id");
		}else {
			for(int j=0; j>=0;j++) {
			System.out.println("Main menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			step=sc.nextInt();
			if(step==1) {
				System.out.println(acc[id].getBalance());
			}else if(step==2) {
				double sum;
				System.out.println("Enter an amount to withdraw: ");
				sum=sc.nextDouble();
				acc[id].withdraw(sum);
			}else if(step==3) {
				System.out.println("Enter an amount to deposit: ");
				double dep=sc.nextDouble();
				acc[id].deposit(dep);
			}else if(step==4){
				break;
			}
		}
		}
	}
	}
}
