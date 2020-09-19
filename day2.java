import java.util.Scanner;

public class day2 {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		
		String input="";
		String result="";
		
		System.out.print("Enter the input string: ");
		input=scanner.nextLine();
		
		for(int i = 0;i < input.length();i++) {
			Character ch = input.charAt(i);
			if(Character.isUpperCase(ch))
				result += "\n" + ch;
			else
				result +=ch;
		}
		System.out.print("The output string is as follows:"+ result);
	}

}
