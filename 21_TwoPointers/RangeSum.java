import java.util.Scanner;

public class RangeSum {
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
    int rangeSum(int l,int r){
        l--;
        r--;
        int res=0;
        while(r>=l){
            res=res+data[l];
            l++;
        }
        return res;
    }
    public static void main(String[] args) {
        RangeSum ob =new RangeSum();
        ob.arrCreate();
        System.out.println(ob.rangeSum(1, 3));
        
    }
}
