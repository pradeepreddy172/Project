package test;

public class String_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String str="hello";
//		str=str+"Pradeep";
//		System.out.println(str);
//		String str1 ="hello Pradeep";
//		if(str.equals(str1)){
//			System.out.println("Block 1");
//		}else {
//			System.out.println("Block 2");
//		}
//		if(str==str1) {
//			System.out.println("Block 2");
//		}
		
		
//	1. chatAt();
		
//		String str="Pradeep";
//		char res=str.charAt(1);
//		System.out.println(res);
		
//  2. codePointAt()
	String str="Pradeep";
	System.out.println(str.codePointAt(0));
//	
//	3.codePointBefore();
//		String str="Pradeep";
//		System.out.println(str.codePointBefore(1));
		
//	 4.codePointCount()
		
//	 String Str = "Pradeep";
//	 System.out.println(Str.codePointCount(1, 7));
		
//	5.compareTo()
	String Str = "Pradeep";
	String Str1="Reddy";
	System.out.println(Str.compareTo(Str1));
		
//	6.compareToIgnorCase
//	String Str = "Pradeep";
//	String Str1="REDDY";
//	System.out.println(Str.compareToIgnoreCase(Str1));
		
//	7.concat()	
//	String Str="Pradeep";
//	String Str1="Reddy";
//	System.out.println(Str.concat(" "+Str1));
	
//	8.contains()
//	String Str="Pradeep";
//		System.out.println(Str.contains("deep"));
		
//	9.contentEquals()	
//		String Str="Pradeep";
//		String Str1="Reddy";
//		System.out.println(Str.contentEquals(Str1));
	
//	10.copyValueOf()
//	char[] str= {'p','r','a','d','e','e','p'};
//	String str1="";
//	str1=str1.copyValueOf(str,0,7);
//	System.out.println(str1);
	
//	11.endsWith()
//	String Str="Pradeep Reddy";
//	System.out.println(Str.endsWith("Reddy"));
	
		
//	12.equals()
//		String Str="Pradeep";
//		String Str1="Pradeep";
//		System.out.println(Str.equals(Str1));
		
//	13.equalsIgnoreCase()
//	String Str="Pradeep";	
//	String Str1="PRADEEP";
//	System.out.println(Str.equalsIgnoreCase(Str1));
		
//	14.format()
		
		
//	String Str="Pradeep %s,%dPerumalla"	;
//	System.out.println(String.format(Str,"Reddy",123));
		
//	15.getBytes()	
//	String str="Pradeep";
//	byte[] str1=str.getBytes();
//	System.out.println(str1[1]);
		
//	16.getChars()
		
//		char[] Str1= {'1','2','3','4','5','6','7','8','9','1','5','6'};
//		System.out.println(Str1);
//		String str="Pradeep,Reddy ";
//		str.getChars(8, 13, Str1, 4);
//		System.out.println(Str1);
//		
		
		
		
//		17.hashcode()
//		String Str="Pradeep";
//		System.out.println(Str.hashCode());
		
//		18.indexof()
//		String Str="Pradeep";
//		System.out.println(Str.indexOf(Str));
		
//		19.intern()
//		String Str="Pradeep";
//		System.out.println(Str.intern());
		
//		20.isEmpty();
//		String Str="Pradeep";
//		System.out.println(Str.isEmpty());
		
//		21.join();
//		String Str=String.join("","Pradeep","Reddy");
//		System.out.println(Str);
		
//		22.lastindex();
//		String Str="Pradeep,Reddy";
//		System.out.println(Str.lastIndexOf("Reddy"));
		
//		23.length();
//		String Str="Pradeep,Reddy";
//		System.out.println(Str.length());
		
//		24.matches();
//		String Str="Pradeep|Reddy";
//		System.out.println("Reddy".matches(Str));
		
//		25.offSetByCodePoints();
//		String Str="Pradeep,Reddy";
//		System.out.println(Str.offsetByCodePoints(1, 5));
		
//		26.regionMatches();
//		String Str="Pradeep,Reddy";
//		String Str1="Reddy";
//		System.out.println(Str.regionMatches(8, Str1, 0, 4));
		
//		27.replace();
//		String Str="Pradeep,Reddy";
//		System.out.println(Str.replace("eddy", "EDDY"));
		
//		28.replaceAll();
//		String Str="Pradeep,Reddy";
//		String Str1="Perumalla";
//		System.out.println(Str.replaceAll("Pradeep", Str1));
		
//		29.replaceFirst();
//		String Str="Pradeep,Reddy";
//		String Str1="Perumalla";
//		System.out.println(Str.replaceFirst("Reddy", Str1));
		
//		30.split();
//		String Str="Pradeep,Reddy";
//		String Str1="";
//		String[] arr=Str.split(Str1);
//		for(String s: arr) {
//			System.out.println(s);
//		}
		
		
//		31.StartsWith();
//		String Str="Pradeep Reddy";
//		System.out.println(Str.startsWith("Pra"));
		
//		32.subSequence();
//		String Str="Pradeep,Reddy";
//		System.out.println(Str.subSequence(5,13));
		
//		33.subString();
//		String Str="Pradeep,Reddy";
//		System.out.println(Str.substring(8, 13));
		
//		34.toCharArray();
//		String Str="Pradeep";
//		char[]Str1=Str.toCharArray();
//		System.out.println(Str1[5]);
		
//		35.toLowerCass();
//		String Str="Pradeep";
//		System.out.println(Str.toLowerCase());
		
//		36.toString();
//		String Str="pradeep";
//		System.out.println(Str.toString());
		
//		37.toUppercase();
//		String Str="Pradeep";
//		System.out.println(Str.toUpperCase());
		
//		38.trim();
//		String Str="      Pradeep  ";
//		System.out.println(Str.trim());
		
//		39.valueOf();
//		String Str="Pradeep";
//		System.out.println(String.valueOf(Str));
	
	
	}}
