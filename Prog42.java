import java.util.Scanner;
class Prog42 {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter some string: ");
	String s = input.nextLine();
	if (s.contains("h")) {
	System.out.println("String \"" + s + "\" contains character \'h\'");
    } 
		else {
		System.out.println("String \"" + s + "\" does not contains character \'h\'");
		}
	}
}