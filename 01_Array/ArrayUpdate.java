import java.util.Scanner;

public class ArrayUpdate {
    int arr[];

    ArrayUpdate(Scanner in) {
        System.out.println("Enter the size of the elements");
        int n = in.nextInt();
        arr = new int[n];
        System.out.println("Enter the" + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
    }

    void arrayUpdate(int i, int x) {
        if (arr.length == 0) {
            System.out.println("Empty Array");
        } else if (arr.length <= i) {
            System.out.println("Index not found");
        } else {
            arr[i] = x;
        }
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + " " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayUpdate ob = new ArrayUpdate(in);
        System.out.println("Enter the indexof the element to be update");
        int i = in.nextInt();
        System.out.println("Enter the new element");
        int x = in.nextInt();
        ob.arrayUpdate(i, x);
        ob.display();
        in.close();
    }
}
