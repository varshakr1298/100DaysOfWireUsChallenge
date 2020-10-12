import java.util.Arrays;
import java.util.Scanner;

public class day24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students in the class: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String input_names[] = new String[n];
		int temp = 0;
		int arr[] = new int[n-1];
		for (int i=0;i<n ;i++) {
			input_names[i] = scanner.nextLine();
		}
		for (int i=0;i<n-1 ;i++ ) {
			String firstsplit[] = input_names[i].split(" ");
			for (int k=i+1;k<n ;k++ ) {
				String secondsplit[] = input_names[k].split(" ");
				if (firstsplit[0].equalsIgnoreCase(secondsplit[0])) {
					arr[temp++] = k;
				}
			}
		}
		System.out.println();
		System.out.println("The output is as follows:");
		temp = 0;
		for (int i=0;i<n ;i++ ) {
			if (i==arr[temp]) {
				String firstSplit[] = input_names[i].split(" ");
				System.out.println(firstSplit[1]);
				temp++;
			}else{
				String secondSplit[] = input_names[i].split(" ");
				System.out.println(secondSplit[0]);
			}
		}
	}

}
