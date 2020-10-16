import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class day28{
	public static void main(String[] args) {
		Stack<String> books = new Stack<String>();
		Stack<Integer> excercise = new Stack<Integer>();
		Stack<String> remaining_book = new Stack<String>();
		Stack<Integer> remaining_excercise = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of books that Louise has finish the excercised with: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the number of excercises and name of the book of which excercise has to be completed with space like (No. of excercises left Book name): ");
		int input[] = new int[n]; 
		int k = 0;
		String temp="";
		for (int i=0;i<n ;i++ ) {
			String input_book_ex = scanner.nextLine();
			String splitAtSpace[] = input_book_ex.split(" ");
			excercise.push(Integer.parseInt(splitAtSpace[0]));
			books.push(splitAtSpace[1]);
			input[i] = Integer.parseInt(splitAtSpace[0]);
		}
		Arrays.sort(input);
		System.out.println("************************************************************************************************************************************************");
		System.out.println("Louise has started studying!!");
		System.out.println("**************************************************************************************************************************************************");
		while(true){
			if (books.isEmpty()||excercise.isEmpty()) {
				break;
			}
			while(input[k]!=excercise.peek()){
				temp = books.pop();
				if(input[k]==-1){
					System.out.print("Invalid input!");
						}
				System.out.println("Placing "+temp+" book with "+excercise.peek()+" excercised onto the messy floor!");
				remaining_book.push(temp);
				remaining_excercise.push(excercise.pop());
			}
			if (input[k]==excercise.peek()) {
				System.out.println("Completed "+excercise.peek()+ " excercises of "+books.peek()+" book.");
				excercise.pop();
				books.pop();

				while(!remaining_excercise.isEmpty()||!remaining_book.isEmpty()){
					excercise.push(remaining_excercise.pop());
					temp = remaining_book.pop();
					System.out.println("Putting the "+temp+" book back to the pile!");
					books.push(temp);
				}
			}
			k++;
		}
		System.out.println("*****************************************************************************************************************************************************");
		System.out.println("Yipee!! Louise has completed all the excersises!");
		System.out.print("**************************************************************************************************************************************************");
	}
}