package week2.day3;

public class Calculator {
	public void additionTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subractionTwoNumbers(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void multipleTwoNumbers(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumbers(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Calculator calci=new Calculator();
		calci.additionTwoNumbers(10,10);
		calci.subractionTwoNumbers(100,50);
		calci.multipleTwoNumbers(36,45);
		calci.divideTwoNumbers(55.5F,11.1F);
	}
}
