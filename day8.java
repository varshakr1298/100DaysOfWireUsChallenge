import java.util.Scanner;

public class day8 {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int m=0;
		System.out.print("Enter the number of strings you want to enter as input strings: ");
		n=scanner.nextInt();
		System.out.print("Enter the number of query strings you want to enter: ");
		m=scanner.nextInt();
		String input[]=new String[n];
		String query[]=new String[n];
		System.out.print("Enter the input strings: ");
		for(int i=0;i<n;i++) {
			input[i]=scanner.next();
		}
		System.out.print("Enter the query strings: ");
		for(int j=0;j<m;j++) {
			query[j]=scanner.next();
		}
		int count[]=new int[m];
		int numEqualWords=0;
		System.out.print("The output is as follows:");
		for(int i=0;i<m;i++) {
			numEqualWords = 1;
			for(int j=0;j<n;j++) {
				
				if(query[i].equals(input[j])) {
					count[i]=numEqualWords++;
				}
			}
			System.out.print("\n"+count[i]);
		}
	}

}
