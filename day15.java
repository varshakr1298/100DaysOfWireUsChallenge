import java.util.Scanner;

public class day15 {
	private static final Scanner scanner = new Scanner(System.in);
		public static int convertStringToInt(String input){
		// Write your code here
        if(input.length()==0)
        {
          return 0;
        }
      int getnum=input.charAt(input.length()-1)-'0';
      return getnum+(10*(convertStringToInt(input.substring(0,input.length()-1))));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		System.out.print("Enter the input string number: ");
		input=scanner.next();
		Long n = Long.parseLong(input);
		System.out.print("The output integer is as follows: "+n);
		int result=convertStringToInt(input);
		System.out.print("The reulting integer is as follows by traditional method: "+result);
	}

}
