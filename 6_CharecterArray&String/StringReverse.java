import java.util.Scanner;
public class StringReverse{
    String str;
    StringReverse(){
        System.out.print("Enter your String"+" ");
        Scanner in=new Scanner(System.in);
        this.str=in.nextLine();
        in.close();
    }
    public static void main(String a[]){
        StringReverse ob= new StringReverse();
        char[] arr=ob.str.toCharArray();
        for(int i=ob.str.length()-1;i>=0;i--)
            System.out.print(arr[i]);
       
    }
    
}