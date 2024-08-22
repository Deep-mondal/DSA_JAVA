class GarandParent{
    void grandParent(){
        System.out.println("GrandParent class callled");
    }
}
class Parent extends GarandParent{
    void parent(){
        System.out.println("Parent class callled");
    }
}
public class Inheritance extends Parent {
    public static void main(String[] args) {
        new Inheritance().grandParent();
        new Inheritance().parent();
    }
}
