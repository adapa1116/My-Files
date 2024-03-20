package ATMTransections;

public class Rversestring {

public String  reversewords(String str) {
		
		
		String rev="";
		 char ch=' ';
		
		for(int i=0;i<str.length();i++) {
			
			ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		
		
		
	
	for(int i=str.length()-1;i>=0;i-- ) {
		
		
		System.out.print(str.charAt(i));
		
	}
	return rev;
	
}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
