import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    int[] data;

    BinarySearch(Scanner in) {
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        data = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            data[i] = in.nextInt();
        }
        Arrays.sort(data); // Sort the array
    }

    int binarySearch(int l, int u, int x) {
        while (l <= u) {
            int mid = l + (u - l) / 2;
            if (data[mid] == x) {
                return mid;
            }
            if (data[mid] < x) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BinarySearch ob = new BinarySearch(in);
        System.out.println("Enter the element to search:");
        int x = in.nextInt();
        int result = ob.binarySearch(0, ob.data.length - 1, x);
        if (result != -1) {
            System.out.println("Element found at sorted index: " + result);
        } else {
            System.out.println("Not Found");
        }
        in.close();
    }
}
