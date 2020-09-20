import java.util.Scanner;
import java.util.Stack;

public class day3 {
	private static final Scanner scanner = new Scanner(System.in);
	
	static int getLargestRectangleArea(int arr[]) {
		if(arr == null || arr.length == 0) {
			return 0;
		}
		
		Stack<Integer> s = new Stack<Integer>();
		
		int maxArea = 0;
		int i = 0;
		int widthOfBar = 0;
		
		while(i < arr.length) {
			//Push the bar index if the current height is greater than the previous one
			
			if(s.isEmpty() || arr[i] >= arr[s.peek()]) {
				s.push(i);
				i++;
			}
			else {
				//Calculate max area when the current height is less than the previous one
				int top = s.pop();
				int heightOfBar = arr[top];
				if(s.isEmpty()) {
					widthOfBar = i;
				}else {
					widthOfBar = i - s.peek() - 1; //Right index - Previous top which is the left index - width of bar that us 1
				}
				maxArea = Math.max(heightOfBar * widthOfBar, maxArea);
			}
		}
		while(!s.isEmpty()) {
			int top = s.pop();
			int heightOfBar = arr[top];
			if(s.isEmpty()) {
				widthOfBar = i;
			}else {
				widthOfBar = i - s.peek() - 1; //Right index - Previous top which is the left index - width of bar that us 1
			}
			maxArea = Math.max(heightOfBar * widthOfBar, maxArea);
		}
		return maxArea;
	}
	
	public static void main(String []args) {
		int numOfBars=0;
		System.out.print("Enter the number of bars for the histogram: ");
		numOfBars=scanner.nextInt();
		//Get the heights of the bars of the histogram from the user
		int arr[] = new int[numOfBars];
		System.out.print("Enter the bar heights: ");
		for(int i=0;i<numOfBars;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.print("The maximum area of the rectangle so formed from the histogram is: "+ getLargestRectangleArea(arr));
	}

}
