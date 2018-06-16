package homework;

public class yanghui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[][] tri = new int[10][10];
	       int i,j;
	       for(i=0 ; i <= tri.length;i++) {
	    	  tri [i] = new int[i+1];
	    	  for(j =0; j<=i;j++) {
	    		  if(i==0||i==j||j==0) {
	    			  tri[i][j]=1;
	    		  }else {
	    			  tri [i][j]=tri[i-1][j] + tri[i-1][j-1];
	    		  }System.out.print(tri[i][j]+" ");
	    	  }System.out.println();
	       }
	}

}
