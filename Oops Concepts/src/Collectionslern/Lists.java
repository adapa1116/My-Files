package Collectionslern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lists {

	public static void list() {
	List<Integer> lst=new Vector<>();
	
	lst.add(100);
	
	for(int i=1;i<=100;i++) {
		
		lst.add(i);
			
	}
	lst.remove(0);
	
    for(int i=1;i<=100;i++) {
		
		lst.add(i);
		
	}
	for(Integer i:lst) {
		
		System.out.println(i);
		
		
	}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list();
		
		
		
	}

}
