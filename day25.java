import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class day25 {
	static StringBuilder removeConsecutiveDuplicates(String input) {
		Set<Character> set = new LinkedHashSet<>();
		 StringBuilder result=new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
		    set.add(input.charAt(i));
		}
		for (Character c : set) {
		    result.append(c);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students in the class: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		String input_names[] = new String[n];
		for (int i=0;i<n ;i++) {
			input_names[i] = scanner.nextLine();
		}
		System.out.println("The output is as follows: ");
		for(int i=0;i<n;i++) {
			StringBuilder result=removeConsecutiveDuplicates(input_names[i]);
			System.out.println(result);
		}
	}

}
