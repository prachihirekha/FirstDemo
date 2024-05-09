package conditional;

public class PracticeDemo {
	// int a;// instance variable
	int add(int a, int b){
//		int a =10; // its a local variable
//		int b =30;
		int rs =a+b;
		//System.out.println(rs);
		return rs;
	}
	public static void main(String[] args) {// main method calling the method
		PracticeDemo  pd = new PracticeDemo ();
		int n=pd.add(3,5);// invoking the method//calling the method
		System.out.println(n);
		// short n=pd.add(3,5);// invoking the method//calling the method
		//System.out.println(n);
}
}
