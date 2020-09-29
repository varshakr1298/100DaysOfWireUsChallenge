import java.util.Scanner;
import java.util.Stack;
//Stock Span Problem 
public class day12 {
	private static final Scanner scanner = new Scanner(System.in);
	
	static void calculateSpanOfStockPrice(int prices[],int spanOfStockPrice[]) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		
		spanOfStockPrice[0]=1;
		
		for(int i=1;i<prices.length;i++) {
			
			while(!stack.empty() && prices[stack.peek()]<=prices[i])
				stack.pop();
			
			if(stack.empty()) {
				spanOfStockPrice[i]=i+1;
			}else {
				spanOfStockPrice[i]=i-stack.peek();
			}
			
			stack.push(i);
		}
		
	}
	static void printSpanValues(int arr[]) {
		
		System.out.print("The span values for stock prices are as follows: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.print("END");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.print("Enter the size of the array: ");
		n=scanner.nextInt();
		int prices[]=new int[n];
		System.out.print("Enter the list of prices for ith day: ");
		for(int i=0;i<n;i++) {
			prices[i]=scanner.nextInt();
		}
		int spanOfStockPrice[]=new int[n];
		calculateSpanOfStockPrice(prices,spanOfStockPrice);
		printSpanValues(spanOfStockPrice);
		
	}

}
