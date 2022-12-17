package week3.day1.assignment4;

public class Students {

	public void getStudentInfo(int i)
	{
		int id = 258258;
		System.out.println("Student ID: " + id);
	}
	public void getStudentInfo(int i, String n)
	{
		int id = 258258;
		String name = "Kiruthika";
		System.out.println("Name: " + name);
	}
	public void getStudentInfo(String e, int p)
	{
		String email = "kj@gmail.com";
		int phoneNumber = 1593572581;
		System.out.println("Email: " + email);
		System.out.println("Phone number: " + phoneNumber);
	}

	public static void main(String[] args) {

		Students st = new Students();
		st.getStudentInfo(123);
		st.getStudentInfo(123, "KJ");
		st.getStudentInfo("em", 123);
	}
}