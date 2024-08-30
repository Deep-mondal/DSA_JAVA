import java.util.Scanner;
import java.util.Stack;

public class LongestSubstringWithoutRepeating {
    static String data;
    static void getString(){
        Scanner in =new Scanner(System.in);
        data=in.nextLine();
    }
    static int slideWindow(){
        Stack<Character> st = new Stack<>();
        int minlength=0,s=0,start=0;
        char a[]= data.toCharArray();
        for(int i=0;i<a.length;i++){
            if(!st.contains(a[i])){
                st.push(a[i]);
                minlength++;
            }
            else{
                while(!st.isEmpty()){
                    st.pop();
                ++start;
                i=i-start+1;
                minlength=0;
            }
        }
       
    }
    return minlength;
}
    public static void main(String[] args) {
        LongestSubstringWithoutRepeating.getString();
        System.out.println(LongestSubstringWithoutRepeating.slideWindow());
    }
}
