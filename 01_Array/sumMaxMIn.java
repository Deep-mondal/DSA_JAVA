class sumMaxMin {
	public static void main(String[] args) {
		int arr[] = {8, 2, 10, 67, 34, 120, 78, 3};
		findSumMaxMin(arr);
	}

	public static void findSumMaxMin(int nums[]) {
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;

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
			if(max1 < num) {
				max3 = max2;
				max2 = max1;
				max1 = num;
			}
			else if(max2 < num) {
				max3 = max2;
				max2 = num;
			}
			else {
				max3 = Math.max(max3, num);
			}
		}
		System.out.println("max1 + min1 = " + (max1 + min1));
		System.out.println("max2 + min2 = " + (max2 + min2));
		System.out.println("max3 + min3 = " + (max3 + min3));
	}
}