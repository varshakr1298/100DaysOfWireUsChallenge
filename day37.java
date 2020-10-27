import java.text.DecimalFormat;
import java.util.Scanner;

public class day37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float w,balance;
		DecimalFormat format=new DecimalFormat(".00");
		System.out.print("Enter Nikhil's withdrawal amount and balance amount($USD) with a space separating both inputs: ");
		w=scanner.nextFloat();
		balance=scanner.nextFloat();
		if(w>balance)
			System.out.print(format.format(balance));
		else if(w%5!=0)
			System.out.print(format.format(balance));
		else
			System.out.print(format.format((balance-w)-0.50));
	}

}
