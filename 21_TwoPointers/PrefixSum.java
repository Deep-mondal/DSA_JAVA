import java.util.Scanner;

public class PrefixSum {
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
    void prefixSum(){
        int l=0;
        int r=1;
        while(r<data.length){
            data[r]=data[r]+data[l];
            r++;
            l++;
        }
    }
    public static void main(String[] args) {
        PrefixSum ob =new PrefixSum();
        ob.arrCreate();
        ob.prefixSum();
        ob.display();
    }
}
