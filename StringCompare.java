package week3.day1;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="I am Learning Java";
		String text2="I am learning java";
		System.out.println("hi");
		if(text1.equals(text2))
		{
			System.out.println("This is equals");
		}
		else {
			System.out.println("not equals");
		}
		if(text1.equalsIgnoreCase(text2)) {
			System.out.println("equals1");
		}
		else
			System.out.println("not equals2");
		if(text1==text2)
		{
			System.out.println("eql");
		}
		else
			System.out.println("not equals3");
	}

}
