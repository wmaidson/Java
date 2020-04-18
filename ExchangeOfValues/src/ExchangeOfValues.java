import java.util.Scanner;

public class ExchangeOfValues {
	
	public static void main(String[] args) {

		String name01;
		String name02;
		String aux;
		
		Scanner ReadKeyboard = new Scanner(System.in);
		
		name01 = " is the Master of the Universe!";
		name02 = "";
		System.out.println("Enxanges of values between variables");
		System.out.print("What's your name?: ");
		name02 = ReadKeyboard.nextLine();
		aux = name02;
		name02 = name01;
		name01 = aux;
		System.out.println(name01 + name02);
		
	}
}

