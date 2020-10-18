import java.util.Arrays;
import java.util.Scanner;

public class day30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=0;
		int n1;
		String result = "";
		String temp = "";
		int i=0;
		System.out.print("Enter the number of test cases: ");
		n = scanner.nextInt();
		while(i<n) {
			System.out.println("Enter the size for the next test case "+(i+1));
			n1 = scanner.nextInt();
			System.out.println("Enter the "+n1+" elements");
			int input[] = new int[n1];
			for (int j=0;j<n1 ;j++ ) {
				input[j] = scanner.nextInt();
			}
			Arrays.sort(input);
			for (int k=0;k<n1 ;k++ ) {
				if (k==0) {
					temp = temp+Integer.toString(input[k]);
				}else if(temp.contains(Integer.toString(input[k]))){
					continue;
				}else{
					temp = temp+Integer.toString(input[k]);
				}
			}
			result = result+temp;
			temp = "";
			i++;
		}
		System.out.println(result);
	}

}
