package Collectionslern;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import ATMTransections.Rversestring;

public class SetReverseString  {

	
	public Set<String > reverString(Set<String> a){
	
		Set<String> str1=new  HashSet<>();
		Rversestring  ab=new Rversestring();
	
		 for(String s:a) {
		
		
		str1.add(ab.reversewords(s));
		
	}
		
		
		
		return	str1;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> str1=new  HashSet<>();
		Scanner sc=new Scanner(System.in);
		
		for(int i=1;i<=5;i++) {
		System.out.println(" the Desired Value");	
		str1.add(sc.next());
		}
		
		SetReverseString ssk=new SetReverseString();
		
		
		
	}

}
