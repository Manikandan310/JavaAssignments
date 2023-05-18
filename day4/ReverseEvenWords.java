package org.test;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String text = "hello, I am a Software tester";
//		 I ma a erawtfas Tester
		String[] split = text.split(" ");
		String rev = "";
		for (int i = 0; i < split.length; i++) {
			System.out.println("--"+split[i]);
			if(i%2==0) {
				String st = split[i];
				for(int j=st.length()-1;j>=0;j--) {
					rev = rev + st.charAt(j);
				}
				rev = rev +" ";
			}
			else if (i%2==1) {
				String st = split[i];
				rev = rev + st + " ";				
			}
		}
		System.out.println(rev);
	}

}
