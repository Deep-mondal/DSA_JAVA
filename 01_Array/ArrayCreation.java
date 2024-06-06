import java.util.Arrays;
import java.util.Scanner;
class ArrayCreation{
	static int n;
	ArrayCreation()
	{
		System.out.println("Enter the size of the array");
		Scanner in =new Scanner(System.in);
		this.n=in.nextInt();
	}
	public static void main(String a[]){
		new ArrayCreation();
		int arr[]=new int[ArrayCreation.n];
		System.out.println("Array is created");
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
			System.out.println(arr[i]);
		}
	}
}
		