package conditional;
// java has default constructor
// default , no-arg constructor, parameterized cons
// access modifer for constructor
// public private, protected
// if vyou gav another name, it will give compile time error
// if you give another name, it is neither a method beacuse  of no return type
//nor constructor beacuse name is different from class name
//
//every class should have at least one constructor
//if you dont write constructor for your class compiler will give default
//default constructor 
// your constuctor can not be final
// constructor can not be static
//we are creating no. of time of same clASS object.
// but every time diff object will be create
// onstructor name shouble be same as class name.
//why beacause , we are creating object by using new ABC()
// ABC() ; here ABC() default contructor will call

public class ConstructorDemo {
	
	// constructor 
	// access modifer name of the constuctor() no 
//	 ConstructorDemo(int a, int b) {// special type of a method
//		System.out.println("ConstructorDemo");
//	
//	}
//	 ConstructorDemo1() {// not a constuctor nor a method
//			System.out.println("ConstructorDemo");
//		
//		}
	 // access modifier  return type name of the method(parameter list)
	void add() {
		System.out.println("normal add method");
	}


	public static void main(String[] args) {
		// class name object operator class constructor
		//ConstructorDemo cd =new ConstructorDemo(19,20);
	//	cd.add();
	}

}
