package week1.day2;

public class PrintOnlyNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String details = "Amazon has 11400 employees in chennai";

		String findNum = details.replaceAll("[^0-9]", "");
		//String findNum = details.replaceAll("[a-zA-z]", "").trim();

		System.out.println(findNum);
	}
}