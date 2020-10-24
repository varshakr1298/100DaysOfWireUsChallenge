import java.util.Scanner;

public class day35 {
	static int countNumberOfOperations(int n) 
	{ 
	    int remainder, value; 
	    remainder = n % 10; 
	    switch (remainder)  
	    { 
	    case 0: 
	        value = 0; 
	        break; 
	    case 5: 
	        value = 1; 
	        break;  
	    default: 
	        value = -1; 
	    } 
	  
	    return value; 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0;
		StringBuilder result=new StringBuilder();
		System.out.print("Enter the number of test cases: ");
		n = scanner.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=scanner.nextInt();
		}
		for(int i=0;i<n;i++) {
			int temp=countNumberOfOperations(input[i]);
			result.append(temp+" ");
		}
		System.out.print("The output is as follows: "+result);
	}

}
