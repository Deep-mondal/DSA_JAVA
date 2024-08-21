public class Pow {
    static int pow(int b,int p){
        if(p==0){
            return 1;
        }
        return b*pow(b,p-1);
    }
    public static void main(String[] args) {
        System.out.println(Pow.pow(5,3));
    }
}
