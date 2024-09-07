import java.util.Scanner;
class NoMatchException extends Exception {
    String detail;
    public NoMatchException(String dtl) {
        detail = dtl;
    }
    @Override
    public String toString() {
        return String.format("NoMatchException[%s]", detail);
    }
}
class Match {
    static void checkAndThrow() throws NoMatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter some word: ");
        String s = input.nextLine();
        if (!(s.equals("india") || s.equals("India") || s.equals("INDIA"))) {
            throw new NoMatchException("Input is not India");
        }
        System.out.println("Normal Exit.");
    }
    public static void main(String[] args) {
        try {
            checkAndThrow();
        } catch (NoMatchException e) {
            System.out.println("Caught error: " + e);
        }
    }
}