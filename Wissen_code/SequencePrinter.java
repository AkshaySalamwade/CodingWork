package Wissen_code;

class NumberPrinter {
    private int number = 1;
    private final int MAX = 10;
    private boolean isOddTurn = true; // T1 starts first

    public synchronized void printOdd() {
        while (number <= MAX) {
            while (!isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (number <= MAX) {
                System.out.println("T1 (Odd): " + number);
                number++;
                isOddTurn = false;
                notify(); // wake up T2
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            while (isOddTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (number <= MAX) {
                System.out.println("T2 (Even): " + number);
                number++;
                isOddTurn = true;
                notify(); // wake up T1
            }
        }
    }
}

public class SequencePrinter {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        Thread t1 = new Thread(() -> printer.printOdd());
        Thread t2 = new Thread(() -> printer.printEven());

        t1.start();
        t2.start();
    }
}
