public class Overload{
    Overload(){
        System.out.println("Non-pametarized constructor");
    }
    Overload(int a){
        System.out.println("Pametarized constructor: with single parameter");
    }
    Overload(int a, int b){
        System.out.println("Pametarized constructor: with double parameter");
    }
    Overload(int a , double b){
        System.out.println("Pametarized constructor: with sequence int, double ");
    }
    Overload(double b, int a){
        System.out.println("Pametarized constructor: with sequence double,int");
    }
    void overload(){
        System.out.println("Non-pametarized  method");
    }
    void overload(int a){
        System.out.println("Pametarized method with single paramenter");
    }
    void overload(int a,int b){
        System.out.println("Pametarized method with double parameter");
    }
    void overload(int a, double b){
        System.out.println("Pametarized method with sequence int double");
    }
    void overload(double b, int a){
        System.out.println("Pametarized method with sequence double int");
    }
    public static void main(String[] args) {
        Overload ob =new Overload();
        ob.overload();
        Overload ob1 =new Overload(1);
        ob.overload(1);
        Overload ob2 =new Overload(1.0,2);
        ob.overload(1.0,5);
        Overload ob3 =new Overload(2,1.0);
        ob.overload(5,1.0);
        Overload ob4 =new Overload(2,1);
        ob.overload(2,1);
    }
}