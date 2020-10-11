import java.util.Scanner;

public class day23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input="";
		String substring="";
		System.out.print("Enter the input string: ");
		input=scanner.nextLine();
		System.out.print("Enter the substring you want to search for in the input: ");
		substring=scanner.nextLine();
		int index=input.indexOf(substring);
		if(substring.isBlank())
			index=0;
		System.out.print("The index of first occurence of substring in the input is as follows: "+index);
	}

}
