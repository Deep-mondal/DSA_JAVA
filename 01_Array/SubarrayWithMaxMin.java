import java.util.Scanner;

public class SubarrayWithMaxMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int sum = 0;
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int min, max;
		for(int i = 0; i < n; i++) {
			min = arr[i];
			max = arr[i];
			for(int j = i; j < n; j++) {
				max = Math.max(max, arr[j]);
				min = Math.min(min, arr[j]);
				System.out.print(arr[j]+" ");
			}
			System.out.println("=> max: " + max + " min: " + min);
		}
		sc.close();
	}
}