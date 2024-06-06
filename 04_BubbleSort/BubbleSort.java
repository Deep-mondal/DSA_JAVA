import java.util.Scanner;

public class BubbleSort {
    int n;
    int a[];
    void bubble(){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

    }
    BubbleSort(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the length of the array");
        this.n=in.nextInt();
        a=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<this.a.length;i++){
            this.a[i]=in.nextInt();
        }
        in.close();
    }
    public static void main(String[] args) {
        BubbleSort obj=new BubbleSort();

        System.out.println("Before Sorting");
        for(int i=0;i<obj.a.length;i++){
            System.out.println(obj.a[i]);
        }
        obj.bubble();
        System.out.println("-----------------------------------------");
        System.out.println("After Sorting");
        for(int i=0;i<obj.a.length;i++){
            System.out.println(obj.a[i]);
        }
        
    }
}