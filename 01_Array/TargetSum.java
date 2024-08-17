import java.util.Scanner;
public class TargetSum{
    int data[];
    int target;
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
    int targetSum(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the Target value");
        this.target=in.nextInt();
        int c=0;
        for(int i=0;i<data.length;i++){
            for(int j=i+1;j<data.length;j++){
                if(data[i]+data[j]==target){
                    c++;
                }
            }
        }
        in.close();
        return c;
    }
    public static void main(String[] args) {
        TargetSum ob =new TargetSum();
        ob.arrCreate();
        System.out.println(ob.targetSum());
        
    }
}