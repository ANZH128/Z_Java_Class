package homework;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        
        System.out.println("空心金字塔");  
       hollowPyramid(8);  
       
       System.out.println("金字塔");  
        fullPyramid(12);  
        
        System.out.println("菱形");  
        fullDiamond(10); 
        
        System.out.println("空心菱形");  
        hollowDiamond(6); 
    }
	
	//空心金字塔
    public static void hollowPyramid(int layer){
        for(int i = 1; i<=layer;i++){
            //空格
            for(int k=1; k <= layer - i ;k++){
                System.out.print(" ");
            }
            
            for(int j = 1;j<=(i-1)*2+1;j++){
              if(i==1 || i== layer) {
            	  System.out.print("$");
              }
              else if (j==1 || j == i*2 -1) {
            	  System.out.print("$");
              }else {
            	  System.out.print(" ");
              }
            }
            System.out.println();}
        }
    //金字塔
     public static void fullPyramid(int layer){
                for(int i = 1; i<=layer;i++){
                    //空格
                    for(int k=1; k <= layer - i ;k++){
                        System.out.print(" ");
                    }
                    
                    for(int j = 1;j<=(i-1)*2+1;j++){
                        System.out.print("$");
                    }
                    System.out.println();}
                }
    //菱形
     public static void fullDiamond(int layer){
             for(int i = 1; i<=layer;i++){
                     //空格
                 for(int k=1; k <= layer - i ;k++){
                        System.out.print(" ");
                   }
                            
                   for(int j = 1;j<=(i-1)*2+1;j++){
                               System.out.print("$");
                       }
                  System.out.println();}
                     for(int i = layer; i>=1;i--){
                             //空格
                         for(int k=1; k <= layer - i ;k++){
                                System.out.print(" ");
                           }
                                    
                           for(int j = 1;j<=(i-1)*2+1;j++){
                                       System.out.print("$");
                               }
                          System.out.println();}}
    //空心菱形
     public static void hollowDiamond(int layer){
    	 for(int i = 1; i<=layer;i++){
             //空格
         for(int k=1; k <= layer - i ;k++){
                System.out.print(" ");
           }
                    
           for(int j = 1;j<=(i-1)*2+1;j++){
               if(i==1 || i == layer) {
            	   System.out.print("$");
               }else if (j == 1 || j == i*2-1) {
            	   System.out.print("$");
               }else{
            	   System.out.print(" ");
               }
             for(int a = layer; a>=1;a--){
                     //空格
                 for(int k=1; k <= layer - i ;k++){
                        System.out.print(" ");
                   }
                            
                   for(int b = 1;b<=(i-1)*2+1;b++){
                       if(a==1|| a == layer) {
                    	   System.out.print("$");
                       }else if (b == 1 || b == a*2-1) {
                    	   System.out.print("$");
                       }else{
                    	   System.out.print(" ");
                       }
                       }
                  System.out.println();}}
	     }
     }
}
