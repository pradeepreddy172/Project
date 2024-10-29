package test;


public class Arithmetic_opp {
//
//	public static void main(String[] args) {
//	
//Without using Methods
//		int num=15;
//		int num1=20;
//		
//		int Add= num+num1;
//		int Sub= num-num1;
//		int Mult= num*num1;
//		int Div= num%num1;
//		
//		System.out.println(Add);
//		System.out.println(Sub);
//		System.out.println(Mult);
//		System.out.println(Div);
//		
//
//	}
	
	int num=15;
	int num1=20;
	
	public static void main(String[] args) {
		
		Add(10,20);
		Sub(10,20);
		Mult(10,20);
		Div(10,20);
	}
	

	static void Add(int num,int num1) {
		int Add= num+num1;
		System.out.println(Add);
	}
	
	static void Sub(int num,int num1) {
		int Sub= num-num1;
		System.out.println(Sub);
	}
	
	static void Mult(int num,int num1) {
		int Mult= num*num1;
		System.out.println(Mult);
	}
	
	static void Div(int num,int num1) {
		int Div= num%num1;
		System.out.println(Div);
	}
}




