package AccessModifier1;

public class  Accessclass2 {

    public int a=500;
	
    static int b=200;
    
    protected  static int c=100;
    
	public void hallo() {
		
		
		System.out.println(a);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Accessclass2 k=new Accessclass2();
		
		k.hallo() ;
	
	System.out.println(b);
	System.out.println(k.c);
	

	
	
	}
	
	

}
