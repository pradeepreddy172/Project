package test;

public class Java_program {
	
	Java_program(){
		System.out.println("This is constructor");
		}
	Java_program(int a,int b){
		int k=a+b;

		System.out.println("this is parametrized con"+k);
	}

	public static void main(String[] args) {
		System.out.println("Main method");		
		
//		sumof (5,6);
//		name("pradeep"," reddy");
		Java_program Object = new Java_program();
		Java_program Object1 = new Java_program(4, 5);
		
		Object.sumof(5, 10);
		Object.name("Pradeep", "reddy");
		
		
		
	}
	
	 int  sumof(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
		
		  void name(String a, String b) {
			String c=a+b;
			System.out.println(c);
		}
}
