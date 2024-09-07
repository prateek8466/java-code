@FunctionalInterface
interface Operation 
{
	int calculate(int a);
}
	class Prog41
 {
	public static void main(String[] args) {
	Operation square = (a) -> a * a;
	int num = 8;
	int result = square.calculate(num);
	System.out.printf("Square of %d is: %d", num, result);
	}
}