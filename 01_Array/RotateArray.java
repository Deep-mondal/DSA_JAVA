class RotateArray{
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		// 6 7 1 2 3 4 5
		rotate(arr, 2);
	} 

	public static void rotate(int arr[], int k) {
		reverse(arr, 0, arr.length - 1); 
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1); 

        for(int num : arr) {
        	System.out.print(num + " ");
        }
	}

	public static void reverse(int arr[], int left, int right) {
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}