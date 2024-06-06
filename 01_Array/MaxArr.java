import java.util.Arrays;

class MaxArr{
	static int arr[]={2,45,6,65,46,24};
	public static void main(String a[]){
		int max=MaxArr.arr[0];
		for(int i=0;i<MaxArr.arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}
}