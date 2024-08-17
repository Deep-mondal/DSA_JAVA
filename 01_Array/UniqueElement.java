import java.util.Scanner;
public class UniqueElement {
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
   int uniqueElement(){
    int c=0;
    int res=-1;
    for(int i=0;i<data.length;i++){
        for (int j=i+1;j<data.length;j++){
            if(data[i]==data[j]){
                data[i]=-1;
                data[j]=-1;
            }
        }
        
    }
    for(int i:data){
        if(i>0)
        res=i;
    }
    return res;
   }
    public static void main(String[] args) {
        UniqueElement ob =new UniqueElement();
        ob.arrCreate();
        System.out.println(ob.uniqueElement());
    }
}
        
 
