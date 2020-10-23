import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class day34 {
	static Integer findMaxArea(Integer input[]) 
    { 
        Arrays.sort(input,Collections.reverseOrder());  
        int[] sides = {0, 0}; 
        for (int i=0, j=0; i<input.length-1 && j<2;i++) 
            if (input[i]==input[i + 1]) 
                sides[j++] = input[i++];
        Integer result=sides[0]*sides[1];
        if(result==0)
        	return -1;
        else
        	return result;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0;
		StringBuilder result=new StringBuilder();
		System.out.print("Enter the number of test cases: ");
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter the number of sticks for test case "+(i+1)+": ");
			int n1=scanner.nextInt();
			Integer input[] = new Integer[n1];
			System.out.print("Enter the length of sticks: ");
			for (int j=0;j<input.length ;j++ ) {
				input[j] = scanner.nextInt();
			}
			Integer temp=findMaxArea(input);
			result.append(temp+" ");
		}
		System.out.print("The maximum area of rectangle from the given sticks: "+result);
	}

}
