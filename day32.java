import java.util.Scanner;

public class day32 {
	static void findDeletedElements(int input[],int p) {
		int sum = 0;
		for (int i=0;i<input.length ;i++ ) {
			sum+=input[i];
		}
		for (int i=0;i<=9;i++ ) {
			sum+=i;
			if (sum==p) {
				System.out.println("The deleted number is: "+i);
				break;
			}
			sum-=i;
		}
		System.out.println("-1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the  value of m: ");
		int m = scanner.nextInt();
		System.out.print("Enter the  value of p: ");
		int p = scanner.nextInt();
		System.out.print("Enter the value of w: ");
		float w = scanner.nextFloat();
		System.out.print("Enter the number of elements in set p: ");
		int n = scanner.nextInt();
		System.out.print("Enter the "+n+" values of set p: ");
		int input[] = new int[n];
		for (int i=0;i<input.length ;i++ ) {
			input[i] = scanner.nextInt();
		}
		findDeletedElements(input,p);
	}

}
