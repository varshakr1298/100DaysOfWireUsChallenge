//The game of number of Chips over the tower
import java.util.Scanner;

public class day26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int h=0;
		System.out.print("Enter the height of the tower: ");
		h=scanner.nextInt();
		int tower[]=new int[h];
		System.out.print("Enter the "+h+" chips to over the tower to start the game: ");
		int i=0;
		for(i=0;i<h;i++) {
			tower[i]=scanner.nextInt();
		}
		while(true) {
			System.out.println("******************************************************************************************************************************");
			System.out.println("\t\t\t\t\tThe Game Of Chips!");
			System.out.println("*****************************************************************************************************************");
			System.out.println("Choice 1: Place a chip over the tower");
			System.out.println("Choice 2: Remove the chip from the top of the tower");
			System.out.println("Choice 3: Display the tower");
			System.out.println("Choice 4: Exit the game!");
			System.out.print("Enter your choice: ");
			int choice=scanner.nextInt();
			switch(choice) {
				case 1: {
					if(i>tower.length-1)
						System.out.println("Oops! The tower is full!");
					else {
						System.out.print("Enter the value of chip you want to place over the tower: ");
						int value=scanner.nextInt();
						tower[i]=value;
						i++;
						System.out.println("Yipeee! The chip is added to the tower!");
					}
				} 
				break;
				case 2: {
					if(i<=0)
						System.out.println("Oops! The tower is empty!");
					else {
						i--;
						int removedChip=tower[i];
						tower[i]=0;
						System.out.println(removedChip+" is removed from the tower!");
						if(i!=0) {
							while(tower[i-1]==removedChip) {
								i--;
								tower[i]=0;
								System.out.println("Oops! "+removedChip+" is falling due to gravity");
							}
						}
					}
				}
				break;
				case 3:{
					if(i<=0)
						System.out.println("Oops! The tower is empty!");
					else {
						System.out.println("Displaying the tower: ");
						
						for(int j=h-1;j>0;j--) {
							if(tower[j]!=0) {
								System.out.print(tower[j]+" ");
							}
						}
					}
				}
				break;
				case 4: {
				System.out.print("Are you sure you want to exit playing the game? ");
				char ch=scanner.next().charAt(0);
				if(ch=='y')
					System.exit(0);
				else
					continue;
				break;
				}
				default: System.out.print("Sorry! Invalid choice entered!");
				break;
			}
		}
	}

}
