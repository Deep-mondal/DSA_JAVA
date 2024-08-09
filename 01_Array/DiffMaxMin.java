class DiffMaxMin {
    public static void diffSubarraySum(int arr[]) {
        int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                minSum = Math.min(currentSum, minSum);
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        System.out.println(minSum);
        System.out.println(maxSum);
        System.out.print(maxSum - Math.abs(minSum));
    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, 5, 7, -5, -8, 9, -1};
        diffSubarraySum(arr);
    }
}
