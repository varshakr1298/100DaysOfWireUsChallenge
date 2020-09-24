import java.util.Scanner;

public class day7 {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="";
		StringBuilder result=new StringBuilder();
		String temp="";
		
		System.out.print("Enter the input string: ");
		input=scanner.nextLine();
		int count=1;
		
		for (int i = 1; i < input.length()-1 ; i++) 
        {
          if (input.charAt(i) == input.charAt(i - 1)) 
          {
            count++;
          } 
          else 
          {
            result.append(input.charAt(i - 1));
            result.append(count);
            count = 1;
          }
        }
		if (input.length() > 1)
        {
        //Comparing the last two characters of the string
        if (input.charAt(input.length() - 1) == input.charAt(input.length() - 2))
          {
            count++;
          } 
          else 
          {
            result.append(input.charAt(input.length() - 2));
            if(count>1)
            result.append(count);
            count = 1;
          }
          result.append(input.charAt(input.length()-1));
          if(count > 1)
          result.append(count);
        }
		System.out.print("The output string is as follows:"+result);
	}

}
