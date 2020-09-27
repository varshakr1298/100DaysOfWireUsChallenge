import java.util.Scanner;

public class day10 {
	private static final Scanner scanner = new Scanner(System.in);
	
	static void leftRotate(int arr[], int numberOfRotations) {
		
		int temp[] = new int[arr.length];
		
		for(int i=0;i<numberOfRotations;i++) {
			temp[i]=arr[i];
		}
		
		for(int i=numberOfRotations;i<arr.length;i++) {
			arr[i-numberOfRotations]=arr[i];
		}
		
		for(int i=0;i<numberOfRotations;i++) {
			arr[i+arr.length-numberOfRotations]=temp[i];
		}
	}
	
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=0;
		int numberOfRotations=0;
		System.out.print("Enter the size of the input array: ");
		size=scanner.nextInt();
		System.out.print("Enter the number of left rotations you want to perform on the array: ");
		numberOfRotations=scanner.nextInt();
		int input[] = new int[size];
		System.out.print("Enter the elements of the input array: ");
		for(int i=0;i<size;i++) {
			input[i]=scanner.nextInt();
		}
		leftRotate(input,numberOfRotations);
		System.out.print("The left rotated array is as follows: ");
		printArray(input);
	}

}
