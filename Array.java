import java.util.ArrayList;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		ArrayList<String> arraylist_1 = new ArrayList<String>(
		Arrays.asList("apple", "banana", "mango", "orange"));
		String element = arraylist_1.get(2);
		System.out.println(element);
	}
}