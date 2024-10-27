import java.util.*;
public class MainAlgo{
    public static void countSort(int data[]){
        int i=0;
        while(i<data.length){
            int cIndex=data[i]-1;
            if(data[i]>0&&data[i]<data.length&&data[i]!=data[cIndex]){
                int temp=data[i];
                data[i]=data[cIndex];
                data[cIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int data[]={3,1,2,4};
        System.out.println(Arrays.toString(data));
        MainAlgo.countSort(data);
        System.out.println(Arrays.toString(data));
    }
}