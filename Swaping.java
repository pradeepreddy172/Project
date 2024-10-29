package test;

public class Swaping {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		System.out.println(a);
		System.out.println(b);

		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println(a);
		System.out.println(b);
		main();
	}
	
	static void main() {
		int a=10;
		int b=20;
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a);
		System.out.println(b);
	}
	

}
