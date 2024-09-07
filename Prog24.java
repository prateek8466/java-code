class Prog24 {
	public static void main(String args[]) {
	String str1="PARTEEK";
	String str2="PARTEEK";
	String str3="My Name Is PARTEEK";
	String str4=" Remove Space";
	System.out.println(str1.equals(str2));
	System.out.println("String Without Trim: "+str4);
	System.out.println("Trimmed String: " + str4.trim());
	System.out.println("Length of string (" + str3 +"): " + str3.length());
	System.out.println("Substring ("+str3+"): " + str3.substring(4));
	System.out.println(str1.compareTo(str2));
	System.out.println(str1.compareTo(str3));
	}
}