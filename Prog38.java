import java.util.Scanner;
class Prog38 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter some string: ");
	String inputString = input.nextLine();
	System.out.println("You have entered: " + inputString);
	input.close();
	}
}