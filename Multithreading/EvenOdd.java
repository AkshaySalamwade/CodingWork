class Printer {
    private boolean evenTurn = false;

    public synchronized void printEven(int num) throws InterruptedException {
        while (!evenTurn) wait();
        System.out.println("Even: " + num);
        evenTurn = false;
        notify();
    }

    public synchronized void printOdd(int num) throws InterruptedException {
        while (evenTurn) wait();
        System.out.println("Odd: " + num);
        evenTurn = true;
        notify();
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread even = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                try { printer.printEven(i); } catch (Exception ignored) {}
            }
        });

        Thread odd = new Thread(() -> {
            for (int i = 1; i < 10; i += 2) {
                try { printer.printOdd(i); } catch (Exception ignored) {}
            }
        });

        even.start();
        odd.start();
    }
}
