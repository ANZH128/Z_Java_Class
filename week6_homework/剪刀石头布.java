package app;
import java.util.*;
import java.util.Scanner;

public class 石头剪刀布 {
	public static void main(String[] args) {
	        System.out.println("欢迎来到石头剪刀布>>>>>>>>>>>");
	Scanner rounds = new Scanner(System.in);
	System.out.println("请输入您想玩的局数");
	int numround = rounds.nextInt();
	 int i;  
     for(i = 1 ; i <= numround ; i++) {
	 System.out.println("第  "+i+" 局:");
	  }
	        //电脑随机生成石头/剪刀/布
	            int computer = (int)(Math.random()*3)+1;
	            
	            String Marks = " ";
	            String Marks1 = " ";
	            switch(computer){
	            
	                case 1:
	                    Marks="石头";
	                    break;
	                case 2:
	                    Marks="剪刀";
	                    break;
	                case 3:
	                    Marks="布";
	                    break;
	            }
	            
	        //User
	        Scanner sc = new Scanner(System.in);
	        System.out.println("请输入 1.石头 2.剪刀 3.布");
	        
	        int player = sc.nextInt();
	        switch( player){
	                case 1:
	                    Marks1="石头";
	                    break;
	                case 2:
	                    Marks1="剪刀";
	                    break;
	                case 3:
	                    Marks1="布";
	                    break;
	        }
	        
	        //判定
	        if(player == computer){
	            System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->平局");
	        }else if((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)){
	            System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->你赢了");
	        }else{
	            System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->你输了");
	        }
	    		 
	        System.out.println("您一共玩了"+numround+"局"); 
	        int Won =0;
	if((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)){
		for(int z = 0;  z <= numround; z ++) {
		Won+=z;
			break;
		}
	}System.out.print("您赢了"+Won+"局");

}


}
	
	
