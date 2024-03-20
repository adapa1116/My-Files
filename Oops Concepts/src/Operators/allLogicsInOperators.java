package Operators;

public class allLogicsInOperators {

	
	static int a=200;
	int b= 3000;
static	int ab;
	
	public  void  add() {
	
	int i=a+b;	
	System.out.println(i);	
	}
	
	
	public static void  sub() {
		allLogicsInOperators aa=new allLogicsInOperators();
		
		int i=a-aa.b;	
		
		System.out.println(i);	
		
	}
		
	public  void  mul() {
		
		
		int ab = a*b;	
		
		System.out.println(ab);	
		
	}
		
public  void  div() {
		
		
		int ab = a/b;	
		
		System.out.println(ab);	
		
	}

public  void  purcentail() {
	
	
	int ab = a%b;	
	
	System.out.println(ab);	
	
}

public static void  bitwiseand() {
	int a=20, //10100
		b=21;// 10101

	int c=a&b; //10100

System.out.println(c);
}
public static void  bitwiseOR() {
	int a=20, //10100
		b=21;// 10101

	int c=a|b;//10101

System.out.println(c);

}
public static void  bitwiseXOR() {
	int a=20, //10100
		b=21;// 10101

	int c=a^b;//00001

System.out.println(c);

}

public static void  bitwiseComplement() {
	int a=20, //10100
		b=21;// 10101

	int c=~b;//01011

System.out.println(c);

}




public static void main(String[] args) {
	
	 bitwiseand();
	 bitwiseOR();
	 bitwiseXOR() ;         
	 bitwiseComplement();
}

}
	
	
	
	
	
	
	
	
	

