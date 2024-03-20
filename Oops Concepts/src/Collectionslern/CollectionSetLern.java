package Collectionslern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionSetLern {

	
	public static void setlern() {
	
		
		ArrayList<String> k=new ArrayList<>();
		
		
		
        for(int i=1;i<100; i++) {

        	k.add("java");
			}
        for(String str:k ) {
		
        	
        	System.out.println(str);
        	
        }
		System.out.println("------------------------------------------hallo");
		
	Set<String>	kk=new HashSet<>(k);
		
		kk.add("hallo");
		kk.add("hallo");
		
		kk.add("Hallo");
		
		
	     for(String i:kk) {
				
	        	System.out.println(i);
			}
		
		
	}
	

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setlern();
		
		
		
	}

}
