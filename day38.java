import java.util.Scanner;

public class day38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n,k;
		n=scanner.nextInt();
		k=scanner.nextInt();
		int input[]=new int[n];
		for(int i=0;i<n;i++) {
			input[i]=scanner.nextInt();
		}
		int count=0;
		for(int j=0;j<n;j++) {
			if(input[j]%k==0)
				count++;
		}
		System.out.print("The output is as follows: "+count);
	}

}
