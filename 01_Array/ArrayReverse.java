import java.util.Scanner;

public class ArrayReverse {
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
    void reverse(){
        int temp=0;
        for(int i=0,j=data.length-1;i<data.length&&j>=0&&i!=j;i++,j--){
            temp=data[i];
            data[i]=data[j];
            data[j]=temp;

        }
        for(int i:data){
            System.out.println(i);
        }
        
    }
    public static void main(String[] args) {
        ArrayReverse ob =new ArrayReverse();
        ob.arrCreate();
        ob.reverse();
        
    }
}
