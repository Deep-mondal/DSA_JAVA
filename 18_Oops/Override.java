class Parent{
    void overRiddenMethod(){
        System.out.println("Parent class method//not over ridden");
    }
}
public class Override extends Parent {
    void overRiddenMethod(){
        System.out.println("Child class method// Over Ridden");
    }
    public static void main(String[] args) {
        new Parent().overRiddenMethod();
        new Override().overRiddenMethod();
    }
}
