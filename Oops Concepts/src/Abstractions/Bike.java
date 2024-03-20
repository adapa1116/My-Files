package Abstractions;

public interface Bike {

	
	int aa=200;
	
public abstract void wheels();
public abstract void engine();   
public abstract void helmat (); 	
	
public abstract void price();

default void helmates(){
	
	System.out.println(" In all bikes give a healmates");
	
}
	
	
}
