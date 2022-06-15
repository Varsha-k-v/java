class Outer{
	void outerMethod(){
		System.out.println("Inside Outer Method");
		//Inner class  is local to outerMethod()
		class Inner{
        		void innerMethod(){
                		System.out.println("Inside Inner Method");
			}
		}
		Inner y=new Inner();
		y.innerMethod();
	}
}
class MethodInner{
	public static void main(String[] args){
		Outer x=new Outer();
		x.outerMethod();
	}
}
