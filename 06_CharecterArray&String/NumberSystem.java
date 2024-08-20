import java.util.*;
public class NumberSystem{
    void takeString(int x,int y){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the String:");
        String str= in.nextLine();
        int val= Integer.parseInt(str);
        int l=str.length();
        int r=0,res=0;
        i
        while(val>0){
            r=val%10;
            res=Math.pow(x,i)*r+res;
            val=(int)val/10;
        }


    }
    int baseConvert(int x,int y){
        return res;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        NumberSystem ob =new NumberSystem();
        ob.takeString();
        System.out.println("Enter 'from' base");
        int x=in.nextInt();
        System.out.println("Enter 'To' base");
        int y= in.nextInt();
        System.out.println(ob.baseConvert(x, y));
        
    }
}