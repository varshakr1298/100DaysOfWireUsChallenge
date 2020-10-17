import java.util.Scanner;
public class day29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.print("Enter the size of the long array: ");
		n=scanner.nextInt();
		System.out.println("Enter the elements that you want to sum up: ");
		long input[]=new long[n];
		long sum=0;
		for(int i=0;i<input.length;i++) {
			input[i]=scanner.nextLong();
		}
		for(int i=0;i<input.length;i++) {
			sum+=input[i];
		}
		System.out.print("The output sum of long array is: "+sum);
	}

}
