class Oddnumber {
   public static void main(String args[]) {
	int n = 10;
	System.out.println("Odd Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.println(i + " ");
	   }
	}
   }
}