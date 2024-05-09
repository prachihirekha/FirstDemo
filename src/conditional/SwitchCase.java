package conditional;

public class SwitchCase {

	public static void main(String[] args) {
		char grade ='A';
		switch(grade) {
		case 'A':
			System.out.println("grade A : excellent");
			break;
		case 'B':
			System.out.println("grade A : good");
			break;
		case 'C':
			System.out.println("grade A :Average");
			break;
			case 'D':
				System.out.println("grade D : Poor");
				break;
				default:
					System.out.println("Invalid grade");
		}
		System.out.println("your grade id"+ grade);
		

	}

}
