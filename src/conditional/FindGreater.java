package conditional;

import java.util.Scanner;

public class FindGreater {

	public static void main(String[] args) {
		int x; 
		System.out.println("enter x number");
		 int y;
		 System.out.println("enter y number");
		 int z;
		 System.out.println("enter z number");
		 Scanner sc = new Scanner(System.in);
		 x=sc.nextInt();
		 y=sc.nextInt();
		 z=sc.nextInt();
		 if(x>y && x>z) {
			 System.out.println(x);
		 }
		 else if(y>x && y>z) {
			 System.out.println(y);
		 }
		 else {
			 System.out.println(z);
		 }
	}
}
