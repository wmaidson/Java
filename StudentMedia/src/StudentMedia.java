import java.util.Scanner;

public class StudentMedia {
	
	public static void main(String[] args) {
		
		String name = "";
		float n1 = 0;
		float n2 = 0;
		float n3 = 0;
		float n4 = 0;
		
		double total = 0;
		double media = 0;
		Scanner ReadKeyboard = new Scanner(System.in);
		
		System.out.println("Calculates the math average");
		System.out.println("");
		System.out.print("What's your name?: ");
		name = ReadKeyboard.nextLine();
		
		System.out.print("Enter First note:");
		n1 = ReadKeyboard.nextFloat();
		
		System.out.print("Enter Second note:");
		n2 = ReadKeyboard.nextFloat();
		
		System.out.print("Enter Third note:");
		n3 = ReadKeyboard.nextFloat();
		
		System.out.print("Enter Fourth note:");
		n4 = ReadKeyboard.nextFloat();
		
		total = n1 + n2 + n3 + n4;
		media = total / 4;
		
		System.out.println(name + " your media is " + media);
	}

}
