package conditional;
// instance variable
// local variable
// static variable
//{} instance block

public class StaticSample {
//	int a;
//	void add()// instance method
	{// instance block
		System.out.println("INstance block");
	}
	static {
		System.out.println("stactic block");
	}
	StaticSample(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		StaticSample s = new StaticSample();
		

	}

}
