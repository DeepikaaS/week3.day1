package week3.day1;
//Assignment7-3rd Question
public class ReplaceCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "I am working with Java8";
		char a='w';
		char[] charArray = text.toCharArray();
		for(int i=0;i<text.length();i++) {
			if(charArray[i]==a)
			{
				charArray[i]='W';
			}
		}
		System.out.println("The given char is replaced in given string");
		for(int i=0;i<text.length();i++) {
		System.out.print(charArray[i]);
		
		}
		System.out.println("");
		for(int i=5;i<15;i++) {
			System.out.print(charArray[i]);
		}
		
	}
}
