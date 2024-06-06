import java.util.Scanner;

public class Insertion {
    int n;
    int a[];
    void insertion(){
        int temp,j;
        for(int i=1;i<this.a.length;i++){
            temp=a[i];
            j=i-1;
            while(j>=0&&temp<=a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }

    }
    Insertion(){
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
        Insertion obj=new Insertion();

        System.out.println("Before Sorting");
        for(int i=0;i<obj.a.length;i++){
            System.out.println(obj.a[i]);
        }
        obj.insertion();
        System.out.println("-----------------------------------------");
        System.out.println("After Sorting");
        for(int i=0;i<obj.a.length;i++){
            System.out.println(obj.a[i]);
        }
        
    }
}