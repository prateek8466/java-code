class Prog25 {
	public static void main(String args[]) 
{
	String str1 ="Hello World";
	String str2 ="Hello World";
	String str3 = new String("Hello World");
	System.out.println(str1.equals(str2));
	System.out.println(str1==str2);
	System.out.println(str1==str3);
	System.out.println(str1.equals(str3));
	}
}