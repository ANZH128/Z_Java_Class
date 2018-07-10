package app;

import java.util.Random;
import java.util.Scanner;

public class Mode {
	public void Death() {        
        //输入您想玩的局数
            Scanner rounds = new Scanner(System.in);	
            System.out.println("请输入您想玩的局数");
            int numround = rounds.nextInt();
            int i;
            int won = 0;
        for( i = 1 ; i <= numround ; i++) {
            System.out.println("第  "+i+" 局:");
  
        
            
            
            
       //电脑随机生成石头/剪刀/布
            Random com = new Random();
            int computer = com.nextInt(3)+1;
            String Marks = "";
            String Marks1 = "";
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
            
        
            
            
        //用户输入生成石头/剪刀/布
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
   
           
           
           
         //判定赢家
            if(player == computer){
		        System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->平局");
		    }else if((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)){
		       	System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->你赢了");         	   
		    }else{
		       	System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->你输了");
	        }
         //计算胜的局数
           if((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)){
        	   won += 1;
           }
         }
          
          System.out.println("      游戏结束");//结束语
          System.out.println("   总局数:" + (i-1));//打印总局数       
          System.out.println("   胜的局数:" + won);//打印赢的局数
          System.out.print("   胜率:" + (double)won/(i-1) * 100 + "%");//打印胜率
      }    
    public void Free() {
    //引语
    	System.out.println("欢迎");
    	int round ;
    	int won = 0;
    for (round = 1 ; round>=0; round ++) {       //局数没有限制
        	//电脑随机生成石头/剪刀/布	
    	Random com = new Random();
        int computer = com.nextInt(3)+1;
        String Marks = "";
        String Marks1 = "";
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
        
    
        
        
    //用户输入生成石头/剪刀/布
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

   //判定赢家
        if(player == computer){
	        System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->平局");
	    }else if((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)){
	       	System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->你赢了");         	   
	    }else{
	       	System.out.println("你出的是： "+ Marks1 + " 电脑出的是： "+Marks + "->你输了");
        }
  //计算胜的局数
       if((player==1&&computer==2)||(player==2&&computer==3)||(player==3&&computer==1)){
    	   won += 1;
      
       }
       
       System.out.println("   当前总局数:" + round);//打印当前总局数       
       System.out.println("   胜的局数:" + won);//打印赢的局数
       System.out.println("   胜率:" + (double)won/round * 100 + "%");//打印胜率 }
    
    }

    
    
    
    
    }
}

