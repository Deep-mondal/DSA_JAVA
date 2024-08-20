import java.util.Scanner;

public class PrintNaturalNumber {
    
    void printNaturalNumber(int x) {
        if (x == 1) {
            System.out.println(x);
            return;
        }
        printNaturalNumber(x - 1);
        System.out.println(x);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintNaturalNumber ob = new PrintNaturalNumber();
        ob.printNaturalNumber(in.nextInt());
    }
}