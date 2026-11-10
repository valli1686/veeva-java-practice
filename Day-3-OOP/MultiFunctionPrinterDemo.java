import java.util.Scanner;

interface Printable {
    void printDocument(String name);
}

interface Scannable {
    void scanDocument(String name);
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void printDocument(String name) {
        System.out.println("Printing " + name);
    }

    public void scanDocument(String name) {
        System.out.println("Scanning " + name);
    }
}

public class MultiFunctionPrinterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc1 = sc.next();
        String doc2 = sc.next();

        MultiFunctionPrinter printer = new MultiFunctionPrinter();

        Printable p = printer;
        Scannable s = printer;

        p.printDocument(doc1);
        s.scanDocument(doc2);
    }
}