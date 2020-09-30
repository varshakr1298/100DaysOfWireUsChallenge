import java.util.Scanner;

//Tower of Hanoi Problem
public class day13 {
	private static final Scanner scanner = new Scanner(System.in);
	
	static void towerOfHanoi(int n, char from, char to, char temp) 
    { 
        if (n == 1) 
        { 
            System.out.println("Shift disk 1 " +  from + " to " + to); 
            return; 
        } 
        towerOfHanoi(n-1, from, temp, to); 
        System.out.println("Shift " + n + " disks from rod " +  from + " to " + to); 
        towerOfHanoi(n-1, temp, to, from); 
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		System.out.print("Enter the number of disks: ");
		n=scanner.nextInt();
		towerOfHanoi(n,'A','C','B');
	}

}
