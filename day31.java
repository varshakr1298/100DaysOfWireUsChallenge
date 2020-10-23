import java.util.Arrays;
import java.util.Scanner;

public class day31 {
	static void findMinimumAbsoluteDifference(int[] inputArray)
    {   
        Arrays.sort(inputArray);
        int minimum = Math.abs(inputArray[1] - inputArray[0]);  
        int firstElement = inputArray[0];
        int secondElement = inputArray[1];
        for (int i = 2; i < inputArray.length; i++) 
        {   
            if(Math.abs(inputArray[i] - inputArray[i-1]) < minimum)
            {
                minimum = Math.abs(inputArray[i] - inputArray[i-1]);
                firstElement = inputArray[i-1];
                secondElement = inputArray[i];
            }
        }
        System.out.println("Minimum Absolute Difference : "+minimum);
         
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0;
		int n1;
		System.out.print("Enter the number of test cases: ");
		n = scanner.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("Enter the size for the next test case "+(i+1)+": ");
			n1 = scanner.nextInt();
			int input[]=new int[n1];
			for(int j=0;j<n1;j++) {
				input[j]=scanner.nextInt();
			}
			findMinimumAbsoluteDifference(input);
		}
	}

}
