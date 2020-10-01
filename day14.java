// Reversing a stack using a linked list 
import java.util.Scanner;
class Node { 
	    int data; 
	    Node next; 
	    public Node(int data) 
	    { 
	        this.data = data; 
	        this.next = null; 
	    } 
	} 
	  
	class Stack { 
	    Node top; 
	    public void push(int data) 
	    { 
	        if (this.top == null) { 
	            top = new Node(data); 
	            return; 
	        } 
	        Node s = new Node(data); 
	        s.next = this.top; 
	        this.top = s; 
	    } 
	    public Node pop() 
	    { 
	        Node s = this.top; 
	        this.top = this.top.next; 
	        return s; 
	    } 
	    public void display() 
	    { 
	        Node s = this.top; 
	        while (s != null) { 
	            System.out.print(s.data + "\n"); 
	            s = s.next; 
	        } 
	        System.out.println(); 
	    } 
	   
	    public void reverse() 
	    { 
	        Node previous, current, temp; 
	        current = previous = this.top; 
	        current = current.next; 
	        previous.next = null; 
	        while (current != null) { 
	  
	            temp = current.next; 
	            current.next = previous; 
	            previous = current; 
	            current = temp; 
	        } 
	        this.top = previous; 
	    } 
	} 
	public class day14 {
		
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stk = new Stack();
		int n;
		System.out.print("Enter the size of stack: ");
		n=scanner.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter the elements you want to enter in the stack: ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("The elements of the stack are as follows: ");
		for(int i=0;i<n;i++)
			stk.push(arr[i]);
		stk.display();
		stk.reverse();
		System.out.println("The reversed stack elements are as follows: ");
		stk.display();
		}
		
	}


