import java.util.Scanner;

public class CheckSubarrayEqualSum {
    int data[];
    void arrCreate(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n= in.nextInt();
        data=new int[n];
        System.out.println("Enter the array values");
        for(int i=0;i<data.length;i++){
            data[i]=in.nextInt();
        }
        
    }
    void display(){
        for(int i:data){
            System.out.print(i+" ");
        }
    }
    boolean sum(int sum){
        boolean res=false;
        int l=0;
        int r=0;
        while(r<data.length){
            if(data[r]==sum){
            
            }
        }
        return res;
    }
}
