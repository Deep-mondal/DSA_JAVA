import java.util.Scanner;
public class RemoveSpecialChar {
     String str;
    RemoveSpecialChar(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your String:"+" ");
        this.str=in.nextLine();
        in.close();
    }
    public static void main(String A[]){
        RemoveSpecialChar ob=new RemoveSpecialChar();
        String resultString=ob.str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(resultString);

    }
}
