package javacore8labbook;

public class FibonacciiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=0,x2=1,x3,i,count=10;    
		 System.out.print(x1+" "+x2);
		    
		 for(i=2;i<count;++i)  
		 {    
		  x3 =x1 + x2;    
		  System.out.print(" "+ x3);    
		  x1 = x2;    
		  x2 = x3;    
		 }    

	}

}
