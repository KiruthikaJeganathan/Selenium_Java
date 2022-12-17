package week3.day1.assignment3;

public class AxisBank extends BankInfo{

	public void deposit()
	{
		System.out.println("Recurring deposit interest rate: 3.5% to 7%");
	}

	public static void main(String[] args)
	{
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}
}