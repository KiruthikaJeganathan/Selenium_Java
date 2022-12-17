package week3.day1.assignment5;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public void Java()
	{
		System.out.println("Java is an object oriented programming language");
	}

	public void Selenium()
	{
		System.out.println("Selenium is an open source tool");
	}

	@Override
	public void ruby()
	{
		System.out.println("Ruby is used to build web applications");
	}

	public static void main(String[] args)
	{
		Automation at = new Automation();
		at.Java();
		at.Selenium();
		at.python();
		at.ruby();
	}
}