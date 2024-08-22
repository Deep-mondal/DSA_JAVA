import java.util.*;
public class MaxsumSubarray{
    static int data[];
    static void arrCreate(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n= in.nextInt();
        data=new int[n];
        System.out.println("Enter the array values");
        for(int i=0;i<data.length;i++){
            data[i]=in.nextInt();
        }
        
    }
    static int maxSumSubarray(int wSize){
        int aSum=0,wSum=0;
        for(int i=0;i<wSize;i++){
            wSum=wSum+data[i];
        }
        for(int i=wSize;i<data.length;i++){
            wSum=wSum+data[i]-data[i-wSize];
            aSum=Math.max(aSum,wSum);
        }
        return aSum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the window");
        int wSize=new Scanner(System.in).nextInt();
        MaxsumSubarray.arrCreate();
        System.out.println(MaxsumSubarray.maxSumSubarray(wSize));
        

    }
}