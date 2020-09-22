import java.util.Scanner;

public class day5 {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="";
		StringBuilder result=new StringBuilder();
		String temp="";
		
		System.out.print("Enter the input string: ");
		input=scanner.nextLine();
		
		
		for(int i = input.length()-1;i >0;i--) {
			
			if(input.charAt(i)!=input.charAt(i-1)) {
				temp+=input.charAt(i);
			}
			else
				temp +="*";
		}
		temp+=input.charAt(0);
		result.append(temp);
		result=result.reverse();
		System.out.print("The output string is as follows:"+result);

	}

}
