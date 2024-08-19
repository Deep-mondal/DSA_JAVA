import java.util.Scanner;
import java.util.Arrays;

public class SortedSquer {
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
    void sortedSquere(){
        for(int i=0;i<data.length;i++){
            data[i]=(int)Math.pow(data[i],2);
        }
        Arrays.sort(data);

    }
    public static void main(String[] args) {
        SortedSquer ob =new SortedSquer();
        ob.arrCreate();
        ob.sortedSquere();
        ob.display();
    }
}
