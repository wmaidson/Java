import java.util.Scanner;

public class HelloName {
	
	public static void main(String[] args) {
		
		String name = "";
		Scanner ReadKeyboard = new Scanner(System.in);
		
		System.out.println("Welcome Program!!!");
		System.out.print("What's your name?: ");
		name = ReadKeyboard.nextLine();
		System.out.println("Hello " + name);
		
	}

}
