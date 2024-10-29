package test;

import java.util.Scanner;

public class Factorial {

//	private static final int Scanner = 0;

	public static void main(String[] args) {
	
//		int n=5;
//		int fact=1;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter the Num");
//		
//		int num = scanner.nextInt();
//		
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}System.out.println("Factorial"+" "+num+ " "+fact);

	
	
		int n=100,first=0,sec=1;
		System.out.println("Fibonacci  "+ n+ " terms");
		for (int i=1; i<=n ; i++) {
			System.out.print(first + " , ");
			int start = first + sec;
			first = sec;
			sec = start;
			}
		
		
		
//		Scanner scanner=new Scanner (System.in); 
//		
//		System.out.println("Enter the Num");
//		System.out.println("1. Case:1");
//		int num =scanner.nextInt();
//		
//		switch(num) {
//		case 0:
//			System.out.println("enter the num");
//			num=scanner.nextInt();
//			for(int i=1;i<=num;i++) {
//			 if (i% 2 == 0) {
//                 System.out.println(num + " is odd.");
//             } else {
//                 System.out.println(num + " is even.");
//             }}
//			break;
//		case 1:
//			
//			System.out.println("enter the num");
//			num=scanner.nextInt();
//			int n =100,first=0,sec=1;
//			System.out.println("Fibonacci  "+ n+ " terms");
//			for (int i=1; i<=n ; i++) {
//				System.out.print(first + " , ");
//				int start = first + sec;
//				first = sec;
//				sec = start;
//			}System.out.println();
			
//	case 3:int p,fact=1;
//			System.out.println("Enter the num");
//			p=scanner.nextInt();
//			for(int i=1;i<=p;i++){
//			fact=fact*i;
//			}
//			System.out.println(fact);
//			break;

		
	
//	}

		
		
		
		
		
}}
