import java.util.*;

public class RemoveDuplicate {
     public static void cyclicSort(int data[]){
        int i=0;
        while(i<data.length){
            int cIndex=data[i]-1;
            if(data[i]>0&&data[i]<=data.length&&data[i]!=data[cIndex]){
                int temp=data[i];
                data[i]=data[cIndex];
                data[cIndex]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<data.length;j++){
            int dIndex=0;
            if(data[j]>0&&data[j]<=data.length&&data[j]!=data[dIndex]){
                int temp=data[j];
                data[j]=data[dIndex];
                data[dIndex]=temp;
                dIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int data[]={4, 3, 2, 4, 1, 1, 5};
        System.out.println(Arrays.toString(data));
        RemoveDuplicate.cyclicSort(data);
        System.out.println(Arrays.toString(data));
    }
}
