import java.io.*;
import java.util.Scanner;
class Prog39 {
	static String fileName = "hello.txt";
	static void writeFile() throws IOException {
	FileWriter file = new FileWriter(fileName);
	file.write("welcome!");
	System.out.println("file is created successfully.");
	file.close();
}
	static void readFile() throws IOException {
	FileReader file = new FileReader(fileName);
	Scanner reader = new Scanner(file);
	String data = reader.nextLine();
	System.out.println("Data in file is: " + data);
	reader.close();
	file.close();
}
	public static void main(String[] args) {
	try {
	writeFile();
	readFile();
	} catch (IOException e) {
		System.out.println("Error occurred: " + e);
		}
	}
}