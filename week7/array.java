package homework;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          double[] mylist = {1.9 , 2.9 , 3.4 , 3.5};
          System.out.print(mylist[0]);
          System.out.print(mylist[1]);    
          System.out.print(mylist[2]);
          System.out.print(mylist[3]);
		System.out.println("the sum is " + mylist[0]+mylist[1]+mylist[2]+mylist[3]);
     int i;
		for(i=0;i<= mylist.length;i++) {
	double max = mylist[0];
	if(mylist[i]>max) {
		System.out.println("the maximum is "+mylist[i]);
	}else {
		System.out.println("the maximum is "+mylist[0]);
	}
	}
	
