import java.util.Scanner;

public class day1 {
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n=0;
        int m=0;
        System.out.print("Enter the number of rows: ");
        n=scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        m=scanner.nextInt();
        int[][] arr = new int[n][m];

        System.out.println("Enter array elements : ");   

        for(int i=0; i<n;i++)
         {            
            for(int j=0; j<m;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
         }
        System.out.print("\nData you entered : \n");
        for(int []x:arr){
            for(int y:x){
            System.out.print(y+" ");
            }
            System.out.println();
            }
        
        System.out.print("Required Output: ");
    	int col = 0;
    	while(col<m) {
    		for(int i=0;i<n;i++) {
    			if(col%2==0) {
    				System.out.print(arr[i][col]+",");
    			}
    			else
    			if(col%2!=0) {
    				System.out.print(arr[(n-i)-1][col]+",");
    			}
    		}
    		col++;
    	}
    	System.out.print("END");
    }
}

