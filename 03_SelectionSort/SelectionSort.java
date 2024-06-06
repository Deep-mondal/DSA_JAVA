import java.util.Scanner;

public class SelectionSort {
    int n;
    int a[];
    void selection(){
        int small;
        for(int i=0;i<a.length;i++){
            small=i;
            for(int j=i+1;j<a.length;j++){          
                if(a[j]<a[small]){          
                    small=j;
                }
                int temp=a[small];
                a[small]=a[i];
                a[i]=temp;
            }
        }

    }
    SelectionSort(){
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
        SelectionSort obj=new SelectionSort();

        System.out.println("Before Sorting");
        for(int i=0;i<obj.a.length;i++){
            System.out.println(obj.a[i]);
        }
        obj.selection();
        System.out.println("-----------------------------------------");
        System.out.println("After Sorting");
        for(int i=0;i<obj.a.length;i++){
            System.out.println(obj.a[i]);
        }
        
    }
}