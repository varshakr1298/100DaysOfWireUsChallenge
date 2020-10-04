import java.util.Arrays;
import java.util.Scanner;

public class day17 {
	public static String[] subsequence(String input){
		// Write your code here
       if(input.length()==0)
       {
       String ans[]={""};
       return ans;
       }
        String smallAns[]=subsequence(input.substring(1));
        String ans[]=new String[2*smallAns.length];
        int k=0;
      int i;
      for(i=0;i<smallAns.length;i++)
      {
        ans[k]=smallAns[i];
        k++;
      }
      for(int j=0;j<smallAns.length;j++)
      {
        ans[k]=input.charAt(0)+smallAns[j];
        k++;
      }
      return ans;
	}
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		System.out.print("Enter the string: ");
		input=scanner.next();
		String result[]=subsequence(input);
		Arrays.sort(result);
		System.out.print("The subsequences of the given string are as follows: ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
