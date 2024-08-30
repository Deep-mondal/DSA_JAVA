import java.util.*;
public class Ksmallest{
    public static List<Integer> kLargest(int data[],int k){
        PriorityQueue<Integer> qu=new PriorityQueue<>(k, Collections.reverseOrder());
        for(int i:data){
            if(qu.size()<k){
                qu.offer(i);
            }
            else if (i<qu.peek()) {
                qu.poll();
                qu.offer(i);
                
            }
        }
        return new ArrayList<>(qu);
    }
    public static void main(String[] args) {
        int data[]={3, 2 ,1 ,5 ,6 ,4};
        List<Integer> res=kLargest(data, 2);
        System.out.println(res);
    }
}