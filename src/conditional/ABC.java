package conditional;
// constructor can be declared as private.
// it you declare constructor  as private, you can"t use it outside that class.

 class ABC {
	 public ABC() {
		 System.out.println("it is a ABC constructor");
	 }
	 public ABC(int a) {
		 System.out.println("it is a ABC constructor with 1 int");
	 }
	 public ABC(int a, int b) {
		 System.out.println("it is a ABC constructor 2 int");
	 }
	 class ConstructorDemo{
		 public static void main(String[] args) {

			 ABC a = new ABC();
			 ABC a1 = new ABC(3);
			 ABC a2= new ABC(3,4);

			}
	 }

	

}
