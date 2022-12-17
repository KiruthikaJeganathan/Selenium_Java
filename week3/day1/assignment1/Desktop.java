package week3.day1.assignment1;

public class Desktop extends Computer{

	public static void desktopSize()
	{
		System.out.println("Desktop size is 20*30*30 inches");
	}

	public static void main(String[] args) {

		Desktop dt = new Desktop();
		dt.computerModel();
		dt.desktopSize();
	}
}