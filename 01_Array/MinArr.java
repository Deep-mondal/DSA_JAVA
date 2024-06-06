import java.util.Arrays;

class MinArr{
	static int arr[]={2,45,6,65,46,24};
	public static void main(String a[]){
		int min=MinArr.arr[0];
		for(int i=0;i<MinArr.arr.length;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println(min);
	}
}