package Collectionslern;

import java.util.ArrayList;
import java.util.List;

public class Arraylistlern {

	
	public static void  lists() {
		
		
	List<Integer> kk=new ArrayList<>();
		
	kk.add(600);
	
	for(int i=0; i<=100;i++ ) {
		
		
		kk.add(i);
		
	}
 kk.remove(1);
     
 	ArrayList<Integer> kp=new ArrayList<>(kk);
     
 	
 	  for(int kk1:kp) {
     	 
     	 
 	    	System.out.println(kk1); 
 	    	 
 	     }
 		
     
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lists();
		
		
	}

}
