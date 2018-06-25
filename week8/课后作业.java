Tutorial Objectives.
To examine algorithms for accessing 1D arrays of reference variables and 2D arrays
Tutorial Activities
1. The class Product is described below. Write a code segment for an array called
   productCatalogue to reference 10 products, read in product data, then display it
   and then find the product number(s) of products costing less than $20
      public class Product {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
            int [] productCatalogue = {10,13,14,16,19,20,40,11,9,1};
           //打印所有价格
	   System.out.print("the prices are : ");
           for (int i = 0; i < 10 ; i++) {
    	
    	    System.out.print("  " + productCatalogue[i]);
       
           }	  
            System.out.println();
            //打印所有比20小的价格
	    System.out.print("the prices that are lower than 20 : ");
           for (int a = 0; a < 10 ; a++) {
    
           if (productCatalogue[a] < 20) {
        	System.out.print("  "+productCatalogue[a]);
              }
       }
	  }

}

 2. How many elements does the array int x[][] = new int[4][5] contain? 
	 20
 3. Design a program to read integers into an integer array of size [3][3]. Treat the
 array as a 3 * 3 image. For example, it may contain the image:
 123
 456
 789
 Your program should then copy the array into a new array such that the image is
 mirrored. For example, the above image would become:
 321
 654
 987
 This new image would then be printed out.
	 package homework;

public class task1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //打印二维数组
	  int[][] square = new int [][] {{1,2,3},{4,5,6},{7,8,9,}};
      for(int row = 0 ; row < square.length;row ++) {
    	  for(int column =0 ; column < square[row].length;column ++) {
    		  System.out.print(square[row][column]);
    	  }
     System.out.println( );
     }
	//反转二维数组
      System.out.println( );
      for (int j = 0; j < square.length / 2; j++) {
    	 for (int k = 0; k <  square[j].length / 2; k++) {
    		 int reverse = square[j][k];
    	     square[j][k] = square[square.length - 1 - j][k];
    	     square[square.length - 1 - j][k] = reverse; 
    	     
    	   }
    	     }
    	  
	System.out.println();
	}
	
	
	}
}
 4. Now modify your algorithm to rotate the original image 180 degrees.
 123 becomes 987
 456 654
 789 321
5. Design a program that reads integers into an array of size[4][4], and then
 calculates if the smallest row total equals the smallest column total.

6. Consider	a	university with	students,	salaried	employees	and	contract					
					employees.	Everyone	has	a	name	and	address.	Students	have	a	'current	degree	
					title'.	Employees	have	a	tax	file	number.	Salaried	employees	have	a	yearly	
					salary	figure,	while	contract	employees	have	an	hourly	rate. What	are	likely
					classes	for	this	system?
package homework;

public class university {
     private String nam;
     private int add;
     private String d;
     private int tax;
     private int yearly;
     private int hourly;
	public class Everyone{
		public void everybody(String name, int address){
			nam = name;
			add = address;
	}
}
    public class Students extends Everyone{
    	public void students(String degree){
    		d = degree;
    	}
    }
    public class Employees extends Everyone{
   
    		public void Salariedemployees(int yearly) {
    	}
            public void Contractdemployees(int hourly) {
	    }
   }
 
}

