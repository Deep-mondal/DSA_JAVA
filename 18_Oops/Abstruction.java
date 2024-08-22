abstract class A{
    abstract void abstractmethod();
}

public class Abstruction extends A{
    void abstractmethod(){
        System.out.println("Abstructed method called");
    }
    public static void main(String[] args) {
        
        new Abstruction().abstractmethod();
    }
}
