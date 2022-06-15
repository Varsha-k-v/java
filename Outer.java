class Outer1{
	class Inner{
		void show(){
			System.out.println("In a nested class method");
		}
	}
}
class Outer{
	public static void main(String[] args){
		Outer1.Inner in=new Outer1().new Inner();
		in.show();
	}
}
