package week3.day1;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Java Exercise";
		char[] charArray = text.toCharArray();
		for(int i=0;i<text.length();i++)
		{
			if(charArray[i]=='E'||charArray[i]=='s') {
				System.out.println("The index "+charArray[i]+"is"+i);
			}
		}
		System.out.println("");
		System.out.println("Get the character for given index");
		int letter=text.charAt(5);
		int letter2=text.charAt(11);
		System.out.println("the index 5 contain "+(char)letter);
		System.out.println("the index 5 contain "+(char)letter2);
	}

}
