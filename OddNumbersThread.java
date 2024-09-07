class OddNumbersThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Odd Number: " + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught error: " + e);
        }
    }
}
class EvenNumbersThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even Number: " + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught error: " + e);
        }
    }
}
class Oddeven {
    public static void main(String[] args) {
        new OddNumbersThread().start();
        new EvenNumbersThread().start();
    }
}