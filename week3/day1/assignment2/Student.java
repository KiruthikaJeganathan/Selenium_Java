package week3.day1.assignment2;

public class Student extends Department{

	public void studentName()
	{
		System.out.println("Student name: Kiruthika");
	}

	public void studentDept()
	{
		System.out.println("Department: ECE");
	}

	public void studentId()
	{
		System.out.println("Id: 159357");
	}

	public static void main(String[] args) {

		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentDept();
		st.studentId();
	}
}