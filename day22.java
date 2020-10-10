import java.util.Scanner;
public class day22 {
	static int printLengthOfLastWord(String input) {
		int length=0;
		String temp = input.trim();
		for(int i=0;i<input.length();i++) {
			if(temp.charAt(i)==' ')
				length=0;
			else
				length++;
		}
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input="";
		System.out.print("Enter the input: ");
		input=scanner.nextLine();
		int resultantLength=printLengthOfLastWord(input);
		System.out.print("The length of the last word of the sentence is as follows: "+resultantLength);
	}

}
