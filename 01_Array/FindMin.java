//import java.util.Scanner;
class FindMin {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String data[] = sc.nextLine().split(" ");
		// int arr[] = new int[data.length];
		// for(int i = 0; i < data.length; i++) {
		// 	arr[i] = Integer.parseInt(data[i]);
		// }
		int arr[] = {10, 34, 1, 75, 8, 9, 12, 54, 11};
		findMin(arr);
	}

	public static void findMin(int nums[]) {
		int min1 = Integer.MAX_VALUE;
		int min2 = min1;
		int min3 = min2;

		for(int num : nums) {
			if(min1 > num) {
				min3 = min2;
				min2 = min1;
				min1 = num;
			}
			else if(min2 > num) {
				min3 = min2;
				min2 = num;
			}
			else {
				min3 = Math.min(min3, num);
			}
		}
		System.out.print("min1: " + min1 + " min2: " + min2 + " min3: " + min3);
	}
}