import java.util.Scanner;
public class day33 {
	public static int ignoreCarrySum(int a, int b) 
    { 
        int res = 0; 
        int p = 1; 
        int sum; 
        while (true) {  
            if(a==0 && b==0) 
            break; 
            sum = (a % 10) + (b % 10);  
            sum %= 10; 
            res = (sum * p) + res; 
            a /= 10; 
            b /= 10;  
            p *= 10; 
            
        } 
        return res; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0;
		System.out.print("Enter the number of test cases: ");
		n = scanner.nextInt();
		int a,b;
		StringBuilder result=new StringBuilder();
		for(int i=0;i<n;i++) {
			System.out.print("Enter the first number: ");
			a=scanner.nextInt();
			System.out.print("Enter the second number: ");
			b=scanner.nextInt();
			int temp=ignoreCarrySum(a,b);
			result.append(temp+" ");
		}
		System.out.print("The output is as follows: "+result);
	}

}
