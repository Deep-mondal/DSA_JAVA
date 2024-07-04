import java.util.Scanner;
public class LinearSearch{
    int n,arr[];
    LinearSearch(int x){
        Scanner in =new Scanner(System.in);
        this.n= x;
        this.arr=new int[this.n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+i+"th element");
            arr[i]=in.nextInt();
        }
        in.close();
    }
    int lSearch(int k){
        int p=k;
        for(int i=0;i<this.n;i++){
            if(arr[i]==p)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n=in.nextInt();
        System.out.println("Enter the element to search");
        int search=in.nextInt();
        LinearSearch ob=new LinearSearch(n);
        int result=ob.lSearch(search);
        System.out.println(result<0?"Not Found":result+1);
        in.close();
    }
    
}