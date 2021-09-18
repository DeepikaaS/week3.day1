package org.method;
//Assignment4
public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		 System.out.println("The Student id  is"+id);

	}
	public void getStudentInfo(int id,String name) {
		// TODO Auto-generated method stub
		 System.out.println("The Student id  is"+id);
		 System.out.println("The Student Name  is"+name);

	}
	private void getStudentInfo(String email,long phoneNumber) {
		// TODO Auto-generated method stub
		 System.out.println("The Student Email id is "+email);
		 System.out.println("The Student Name  is "+phoneNumber);
	}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(5);
		obj.getStudentInfo(1, "Deepikaa");
		obj.getStudentInfo("deepikss.Sen@gmail.com", 5678765678L);
	}
}
