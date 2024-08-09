import java.util.Scanner;

public class SubarrayWithSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for(int i = 0; i < n; i++) {
			sum = 0;
			int temp[] = new int[n - i];
			int index = 0;
			for(int j = i; j < n; j++) {
				sum += arr[j];
				temp[index] = arr[j];
				index++;
			}
			for(int num : temp) {
				System.out.print(num + " ");
			}
			System.out.println("=>" + sum);
		}
		sc.close();
	}
}