import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class day9 {
	private static final Scanner scanner = new Scanner(System.in);
	
	static void reverse(Integer []arr) {
		Collections.reverse(Arrays.asList(arr));
		List a= Arrays.asList(arr);
		Integer reversedArray[]=new Integer[a.size()];
		a.toArray(reversedArray);
		for(int i=0;i<reversedArray.length;i++) {
			System.out.print(reversedArray[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=0;
		System.out.print("Enter the size of the array: ");
		n=scanner.nextInt();
		
		Integer arr[]=new Integer[n];
		
		System.out.print("Enter the elements of array: ");
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.print("The reversed array is as folows: ");
		reverse(arr);
	}

}
