package B1;

    public class basic2 {
	
	    int a=10; // instance variable
        int b=20;
        int c=30;
        int d=(a+b*c);
        
        static int e=12;  // static variable
        
        public void M1 () {
        	
        	int r=23;    // local variable
        }
        
	    public static void main(String[] args) {
	    	
		System.out.println("hello");
		
		basic2 abc=new basic2();
		
		System.out.println(abc.d);
		System.out.println(abc.e);
	}

}
