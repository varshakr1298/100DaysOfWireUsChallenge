import java.util.Scanner;

public class day36 {
	static int findGcd(int x, int y)
    {
        int r=0, a, b;
        a=(x>y)?x:y; 
        b=(x<y)?x:y; 
        r = b;
        while(a%b!=0)
        {
            r=a%b;
            a=b;
            b=r;
        }
        return r;
    }
 
    static int findLcm(int x, int y)
    {
        int a;
        a=(x>y)?x:y; 
        while(true)
        {
            if(a%x==0&&a%y==0)
                return a;
            ++a;
        }	
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=0;
		StringBuilder result=new StringBuilder();
		System.out.print("Enter the number of test cases: ");
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			int firstnumber=scanner.nextInt();
			int secondnumber=scanner.nextInt();
			int gcd=findGcd(firstnumber,secondnumber);
			int lcm=findLcm(firstnumber,secondnumber);
			result.append(gcd+" "+lcm+" ");
		}
		System.out.print("The output is as follows: "+result);
	}

}
