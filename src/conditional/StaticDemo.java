package conditional;
// when we method make a static there is no need to cread a object
public class StaticDemo {
	static int a =0;
	 void add() {
		 a++;
		 System.out.println(a);
	 }
	 

	public static void main(String[] args) {
		StaticDemo s1= new StaticDemo();
		s1.add();
		StaticDemo s2= new StaticDemo();
		s2.add();
		StaticDemo s3= new StaticDemo();
		s3.add();
	}

}
