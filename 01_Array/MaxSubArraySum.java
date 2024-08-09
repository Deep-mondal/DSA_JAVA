import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String a[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int max = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
            }
            if (sum > max)
                max = sum;
        }
        System.out.print(max);
        in.close();
    }
}
