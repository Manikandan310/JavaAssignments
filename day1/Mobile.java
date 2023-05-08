package week2.day1;

public class Mobile {
	String mobileBrandName="Samsung Galaxy A31";
	char mobileLogo='S';
	short noOfMobilePiece=15;
	int modelNumber=31;
	long mobilemeiNumber=564897512300369487L;
	float mobilePrice=25000.00F;
	boolean isDamaged=false;
	public static void main(String[] args) {
		Mobile Samsung=new Mobile();
		System.out.println(Samsung.mobileBrandName);
		System.out.println(Samsung.mobileLogo);
		System.out.println(Samsung.noOfMobilePiece);
		System.out.println(Samsung.mobilemeiNumber);
		System.out.println(Samsung.mobilePrice);
		System.out.println(Samsung.isDamaged);		
	}
}

