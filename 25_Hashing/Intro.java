import java.util.HashMap;
public class Intro{
    public static void main(String a[]){
        int arr[]={10,20,25,65,21,41,10};
        HashMap <Integer,Integer> map =new HashMap<>();
        int i=0;
        while(i<arr.length){
            map.put(i,arr[i]);
            i++;
        }
        System.out.println(map);

        
    }
}