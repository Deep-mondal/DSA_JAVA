package DSA;

import java.util.Scanner;

public class Stack {
	static int top=-1;
	static void push(int x,int a[]) {
		a[++top]=x;
		System.out.println("Element "+ x +" pushed");
	}
	static void pop(int a[]) {
		System.out.println("Element poped:"+ a[top]);
		top--;
	}
	static void display(int a[]) {
		for(int i=0;i<top+1;i++)
			System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the size of the stack");
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int stack[]=new int[size];
		while(true) {
		System.out.println("=============================");
		System.out.println("Enter any choice by a number");
		System.out.println("     "+"1.Push");
		System.out.println("     "+"2.Pop");
		System.out.println("     "+"3.Display");
		System.out.println("     "+"4.Exit");
		System.out.println("=============================");
		int ch=in.nextInt();
			switch(ch) {
			case 1:if(top==size-1)
					System.out.println("Stack is full");
				   else
						System.out.println("Enter a element");
						int x=in.nextInt();
						push(x,stack);
						break;
			case 2:if(top==-1)
						System.out.println("Stack is empty");
			   		else
			   			pop(stack);
					break;
			case 3:display(stack);break;
			case 4: return;
			default:System.out.println("Enter valid choice");
			
			}
			
		}
	}

}
