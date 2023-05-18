package week3.day4;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		
		int count;
		String output="";
		String[] text1=text.split(" ");
		
		
		for (int i = 0; i < text1.length; i++) {
			String text2=text1[i];
			
			count=0;
				for (int j = i+1; j < text1.length; j++) {
					
					if(text2.equals(text1[j])) {
						count++;
						if(count>0) {
							text1[j]="";
						
					}
					
				}
			}
			if(!text2.equals(" ")) {
				output=output + text2 + " ";
			}		
		}
		System.out.println(output);
	}
}

