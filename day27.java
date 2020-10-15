import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day27 {
	static void countAndPrintRepeatedWords(String input) {
		Map<String,Integer> hashmap=new HashMap<String,Integer>();
		
		String words[]=input.split(" ");
		
		for(String word:words) {
			String temp=word.toLowerCase();
			if(hashmap.containsKey(temp)) {
				hashmap.put(temp, hashmap.get(temp)+1);
			}
			else {
				hashmap.put(temp, 1);
			}
		}
		ArrayList keyList = new ArrayList(hashmap.keySet());
		for (int i = keyList.size() - 1; i >= 0; i--) {
			String key = (String) keyList.get(i);
			Integer value = hashmap.get(key);
			System.out.print(key+" "+value+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Enter the number of strings you want to enter: ");
		n=scanner.nextInt();
		String input[]=new String[n];
		for(int i=0;i<n;i++) {
			input[i]=scanner.next();
		}
		StringBuilder builder = new StringBuilder();
		for (String value : input) {
		    builder.append(value+" ");
		}
		String inputwords = builder.toString();
		countAndPrintRepeatedWords(inputwords);
	}

}
