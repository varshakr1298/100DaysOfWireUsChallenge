import java.util.Scanner;

public class day20 {
	static void findNonConsecutive1s(int n) 
    {  
        int p = (1 << n); 
        for (int i = 1; i < p; i++) 
        	if ((i & (i << 1)) == 0) 
        System.out.print(i + " "); 
      
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of bits: ");
		n=scanner.nextInt();
		System.out.print("The output is as follows: ");
		findNonConsecutive1s(n);
	}

}
