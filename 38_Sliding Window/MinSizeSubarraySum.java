import java.util.Scanner;

public class MinSizeSubarraySum{
    static int data[];
    static int target;
    static void arrCreate(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n= in.nextInt();
        data=new int[n];
        System.out.println("Enter the array values");
        for(int i=0;i<data.length;i++){
            data[i]=in.nextInt();
        }
        System.out.println("Enter the target");
        target=in.nextInt();
        
    }
    static int exeMethod(){
        int l=0,sum=0,j=0;
        for(int i=0;i<data.length;i++){
            sum=sum+data[i];
            while(sum>=target){
                l=Math.max(l,i-j+1);
                sum=sum-data[j++];
            }
        }
        return l== 0?0:l;

    }
    public static void main(String[] args) {
        MinSizeSubarraySum.arrCreate();
        System.out.println(MinSizeSubarraySum.exeMethod());
    }
}