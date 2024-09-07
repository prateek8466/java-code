import java.util.Scanner;
class Prog43 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter some string: ");
String s = input.nextLine();
if (s.matches("^[a-z]+_[a-z]+$")) {
System.out.println("Match found!");
} else {
System.out.println("Match not found!");
}
}
}