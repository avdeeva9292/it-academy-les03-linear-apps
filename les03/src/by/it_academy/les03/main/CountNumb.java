package by.it_academy.les03.main;

public class CountNumb {

	public static void main(String[] args) {

		int number = 1000000000;
		int count;
		count = (int) Math.log10(number) + 1;

		System.out.print("количество цифр в числе " + number + " " + count);

	}

}
