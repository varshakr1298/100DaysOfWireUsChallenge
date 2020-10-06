import java.util.Scanner;

public class day19 {
	 static char compare(char a, char b) 
	    { 
	        return (a == b) ? '0' : '1'; 
	    } 
	static String binarytoGray(String input) 
    { 
        String gray = ""; 
        gray += input.charAt(0); 
        for (int i = 1; i < input.length(); i++) { 
            gray += compare(input.charAt(i - 1),input.charAt(i)); 
        } 
  
        return gray; 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter in binary code of the decimal number: ");
		String input =scanner.next();
		
		System.out.print("Output Grey Code: "+binarytoGray(input));

	}
}
