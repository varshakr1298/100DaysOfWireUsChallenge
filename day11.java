import java.util.Scanner;

public class day11 {
	
	static void convertTo24(String input) {

	    int hours = ((int)input.charAt(0) - '0') * 10 + ((int)input.charAt(1) - '0') % 10;
	  
	    // AM
	    if (input.charAt(8) == 'A') 
	    { 
	        if (hours == 12) 
	        { 
	            System.out.print("00"); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(input.charAt(i)); 
	        } 
	        else
	        { 
	            for (int i = 0; i <= 7; i++) 
	                System.out.print(input.charAt(i)); 
	        } 
	    } 
	  
	    // PM 
	    else
	    { 
	        if (hours == 12) 
	        { 
	            System.out.print("12"); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(input.charAt(i)); 
	        } 
	        else
	        { 
	        	hours = hours + 12; 
	            System.out.print(hours); 
	            for (int i = 2; i <= 7; i++) 
	                System.out.print(input.charAt(i)); 
	        } 
	    } 
	}  

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="";
		System.out.print("Enter the time in 12 hour format: ");
		input=scanner.next();
		convertTo24(input);
	}

}
