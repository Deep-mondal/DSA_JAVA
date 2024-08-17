import java.util.Scanner;

public class ArrayRotetion{
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
    void rotation(int n){
        int temp=0;
        while(n>0){
            for(int i=data.length-1;i>=0;i--){
                temp=data[i];
                while(i>0){
                    data[i]=data[i-1];
                    i--;
                }
                
                data[0]=temp;
            }
            n--;
        }
        for(int i:data){
            System.out.print(i+"\t");
        }
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayRotetion ob =new ArrayRotetion();
        ob.arrCreate();
        System.out.println("Enter the number of times:");
        int x=in.nextInt();
        ob.rotation(x);
    }
}