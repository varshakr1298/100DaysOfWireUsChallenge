import java.util.Scanner;

public class day16 {
	private static final Scanner scanner = new Scanner(System.in);
	static void printAllBinarySequences(int d, char result[], int s, int e) 
	{ 
		//Handling the case if the difference is more than n with a total of 2n bits 
		if (Math.abs(d) > (e-s + 1) / 2) 
			return; 
		if (s>e) 
		{ 
			if (d == 0) 
			{ 
				System.out.print(result); 
				System.out.print(" "); 
			}     
		return; 
		} 

		result[s] = '0'; 
		result[e] = '1'; 
		printAllBinarySequences(d+1,result, s+1, e-1); 
		result[s] = '1'; 
		result[e] = '0'; 
		printAllBinarySequences(d-1,result,s+1,e-1); 
		result[s] = result[e] = '1'; 
		printAllBinarySequences(d, result,s+1,e-1); 
		result[s] = result[e] = '0'; 
		printAllBinarySequences(d,result,s+1, e-1); 
		} 
	public static void main (String[] args)  
    { 
        int n = 0; 
        System.out.print("Enter the value of n: ");
        n= scanner.nextInt();
        //Assigning a resultant array that will store all the sequences with a length of array one more than 2n
        char[] resultArray = new char[2*n + 1];   
        resultArray[2 * n] = '\0';  
        System.out.println("Printing all the sequences in which the sum of first n bits is equal to the last n bits : ");
        printAllBinarySequences(0,resultArray,0,2*n-1); 
    } 
}
