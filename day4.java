import java.util.Scanner;

public class day4 {
	
	private static final Scanner scanner = new Scanner(System.in); 
	
	public static void main(String []args) {
		String input;
		System.out.print("Enter the input string: ");
		input = scanner.next();
		String result = "";
		for(int i=0;i<input.length()-1;i++) {
			result += input.charAt(i);
			result += input.charAt(i+1)-input.charAt(i);
		}
		result+=input.charAt(input.length()-1);
		System.out.print(result);
	}

}
