import java.util.Scanner;

public class FirstvalueRepeate {
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
   int firstvalueRepeate(){
    
    int res=-1;
    for(int i=0;i<data.length;i++){
        for (int j=i+1;j<data.length;j++){
            if(data[i]==data[j]){
                res=data[i];
            }
        }
        
    }
    return res;
   }
    public static void main(String[] args) {
        FirstvalueRepeate ob =new FirstvalueRepeate();
        ob.arrCreate();
        System.out.println(ob.firstvalueRepeate());
    }
}
