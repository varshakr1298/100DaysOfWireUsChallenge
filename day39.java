import java.util.Scanner;

public class day39 {
	static boolean checkPalindrome(int input) {
        int reversedNumber = 0, remainder, originalNumber;
        originalNumber = input;
        while(input!=0)
        {
            remainder=input%10;
            reversedNumber=reversedNumber*10+remainder;
            input/=10;
        }
        if(originalNumber==reversedNumber)
            return true;
        else
            return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		StringBuilder result=new StringBuilder();
		System.out.print("Enter the number of test cases: ");
		n=scanner.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=scanner.nextInt();
			boolean flag = checkPalindrome(input[i]);
			if(flag==true)
				result.append("wins"+" ");
			else
				result.append("loses"+" ");
		}
		System.out.print("Output is as follows: "+result);
	}

}
