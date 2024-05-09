package conditional;

public class FinalDemo {
	//final float a=3.14f;
	int a;
	void display() {
		a++;
		System.out.println(a);
		//System.out.println(a);
	}

	public static void main(String[] args) {
		FinalDemo fd = new FinalDemo();
		fd.display();
	}

}
