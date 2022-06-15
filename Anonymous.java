class Demo{
	void show(){
		System.out.println("in show method of super class.");
	}
}
class Anonymous{
	//An anonymous class with Demo as base class
	static Demo d=new Demo(){
		void show(){
			//calling method show() via super keyword which refers to parent class
			super.show();
			System.out.println("I am in Anonymous class");
		}
	};
	public static void main(String[] args){
		d.show();	
	}
}
