import java.util.Scanner;

public class day21 {
	static int getValue(char roman) 
    { 
		int value=0;
        switch(roman) {
        case 'I': value = 1; break;
        case 'V': value = 5; break;
        case 'X': value = 10; break;
        case 'L': value = 50; break;
        case 'C': value = 100; break;
        case 'D': value = 500; break;
        case 'M': value = 1000; break;
        }
        return value;
    } 
	static int convertRomanToNumber(String input) 
    { 
        int result = 0; 
        for (int i = 0; i < input.length(); i++) { 
            int first = getValue(input.charAt(i)); 
            if (i + 1 < input.length()) { 
                int next = getValue(input.charAt(i + 1)); 
                if (first >= next) { 
                    result=result+first; 
                } 
                else { 
                	result=result+next-first; 
                    i++; 
                } 
            } 
            else { 
            	result=result+first; 
                i++; 
            } 
        } 
  
        return result; 
    } 
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input="";
		System.out.print("Enter the input roman numeral: ");
		input=scanner.next();
		int result=convertRomanToNumber(input);
		System.out.print("The output number is as follows: "+result);
	}

}
