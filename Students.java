package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("Student ID : " + id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student name : " +name);
		System.out.println("Student ID : " + id);
	}
	public void getStudentInfo(String email,long phoneNum) {
		System.out.println("Student email : "+ email);
		System.out.println("Student Phone : " + phoneNum);
	}
}

