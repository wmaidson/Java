import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		int n = 0;
		String valueRead = "";
		
		Scanner readKeyboard = new Scanner(System.in);
		
		System.out.println("Program that display the multiplication table of a number");
		System.out.println("");
		System.out.print("Enter a number:");
		valueRead = readKeyboard.nextLine();
		n = Integer.parseInt(valueRead);
		System.out.println(n + " x 1 = " + (n*1));
		System.out.println(n + " x 1 = " + (n*2));
		System.out.println(n + " x 1 = " + (n*3));
		System.out.println(n + " x 1 = " + (n*4));
		System.out.println(n + " x 1 = " + (n*5));
		System.out.println(n + " x 1 = " + (n*6));
		System.out.println(n + " x 1 = " + (n*7));
		System.out.println(n + " x 1 = " + (n*8));
		System.out.println(n + " x 1 = " + (n*8));
		System.out.println(n + " x 1 = " + (n*10));
		
		
	}

}
