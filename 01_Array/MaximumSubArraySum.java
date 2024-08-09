import java.util.Scanner;
public class MaximumSubArraySum {
	public static void maximumSubarraySum (int nums[]) {
		int maxSum = Integer.MIN_VALUE;
        int currentSum = Integer.MIN_VALUE;;
        for (int i = 1; i < nums.length; i++) 
        {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.print(maxSum);
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		maximumSubarraySum(arr);
		sc.close();
	}
}

