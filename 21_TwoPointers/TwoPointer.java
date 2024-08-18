import java.util.Scanner;

public class TwoPointer {
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
    void sortTwoPointer(){
        int l,r;
        l=0;
        r=data.length-1;
        while(r>l){
            if(data[l]>data[r]){
                int temp=data[l];
                data[l]=data[r];
                data[r]=temp;
            }
            l++;
            r--;
        }
    }
    
    public static void main(String[] args) {
        TwoPointer ob =new TwoPointer();
        ob.arrCreate();
        ob.display();
        System.out.println("---------------------");
        ob.sortTwoPointer();
        ob.display();
    }
}
