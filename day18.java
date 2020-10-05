import java.util.Arrays;
import java.util.Scanner;

public class day18 {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void triangleSum(int[] arr) 
    { 
        if (arr.length < 1) 
            return; 
  
        int[] temp = new int[arr.length - 1]; 
        for (int i=0; i<arr.length-1; i++) 
        { 
            int sum = arr[i]+arr[i+1]; 
            temp[i] = sum; 
        } 
  
        triangleSum(temp); 
  
        System.out.println(Arrays.toString(arr)); 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter the size of array: ");
		n=scanner.nextInt();
		int input[]=new int[n];
		System.out.print("Enter the array elements: ");
		for(int i=0;i<n;i++) {
			input[i]=scanner.nextInt();
		}
		System.out.println("The output is as follows: ");
		triangleSum(input);
	}

}
