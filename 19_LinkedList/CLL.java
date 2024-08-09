import java.util.Scanner;
class Node {
    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node head;

    public  void insertFirst(int x) {
        Node newNode = new Node(x);
        head = newNode;
        newNode.next=head;
    }

    public  void insertLast(int x) {
        Node newNode =new Node(x);
        Node temp =head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
    }
    public void delFirst(){
        Node temp=head;
        temp=temp.next;
        head.next=temp;
    }
    public void delLast(){
        Node temp =head;
        Node p1=head;
        while(temp.next!=head){
            temp=temp.next;
            p1=p1.next;
        }
        p1.next=head;
    }
    public static void main(String a[]){
        CircularLinkedList lt =new CircularLinkedList();
        int ch=new Scanner(System.in).nextInt();
        while(true){
            System.out.print("1.Add at beg");
            System.out.print("1.Add at last");
            System.out.print("1.del at beg");
            System.out.print("1.del at last");
            System.out.print("1.exit");
            System.out.print("Enter your choice by selecting a number:");
            switch(ch){
                case 1: int x=new Scanner(System.in).nextInt();
                        lt.insertFirst(x);
                        System.out.print("Inserted");
                        break;
                case 2: int y=new Scanner(System.in).nextInt();
                        lt.insertLast(y);
                        System.out.print("Inserted");
                        break;
                case 3:lt.delFirst();
                        System.out.print("Deleted");
                        break;
                case 4:lt.delLast();
                         System.out.print("Deleted");
                         break;
                default:
                    return;
            }
        }
    }

}
