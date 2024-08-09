import java.util.Scanner;
public class GraphCreate{
    int a[][];
    void create(){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the no of vertices in the graph");
        int v=in.nextInt();
        a=new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.println("Enter The edge weight from"+" "+i+" "+"to"+" "+j);
                this.a[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(this.a[i][j]+" ");
            }
            System.out.println("\n");
        }
        in.close();
    }

    public static void main(String[] args) {
        GraphCreate ob =new GraphCreate();
        ob.create();
    }
}