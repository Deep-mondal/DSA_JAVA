
package pkg37_javacollectionframework;
import java.util.ArrayList;
public class ArrayListDemo extends ArrayList<Integer> {
    public static void main(String arg[])
    {
        ArrayListDemo ob=new ArrayListDemo();
        for (int i=0;i<10;i++)
            ob.add(i);
        System.out.println(ob);
        
        
    }
}
