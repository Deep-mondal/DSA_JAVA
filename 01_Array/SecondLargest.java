import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {
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
    int secondlargest(){
        Arrays.sort(data);
        return data[data.length-2];
    }
    public static void main(String[] args) {
        SecondLargest ob =new SecondLargest();
        ob.arrCreate();
        System.out.println(ob.secondlargest());
        
    }
}
