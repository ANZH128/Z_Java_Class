package app;
import java.util.*;
import java.util.Scanner;

public class 石头剪刀布 {
	public static void main(String[] args) {
	        //游戏开始
		 System.out.println("欢迎来到石头剪刀布>>>>>>>>>>>");
	     System.out.println("请选择游戏模式");
	     System.out.println("游戏模式:  1.死斗模式             2.自由模式");
	     Scanner opt = new Scanner(System.in);
	     int option = opt.nextInt();	               
	      if(option == 1) {
	    	 System.out.println("您选择了死斗模式");
	    	 Mode death = new Mode();
	    	 death.Death();
	    }else if(option == 2) {
	    	 System.out.println("您选择了自由模式");
	    	 Mode free = new  Mode();
	    	 free.Free();
	     
	    
	     }
	     
	     
	         
	

	     
	     
	}
}           

	
