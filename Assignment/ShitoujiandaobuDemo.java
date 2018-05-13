/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shidaojiandaobudemo;
import java.util.*;
/*
System.out.println();
Scanner
*/
/**
 *
 * @author Antoine-Desktop
 */
public class ShidaojiandaobuDemo {

    public static void main(String[] args) {
        System.out.println("欢迎来到石头剪刀布>>>>>>>>>>>");
        
        //电脑随机生成石头/剪刀/布
            int computer = (int)(Math.random()*3)+1;
            
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
            
        //User
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 1.石头 2.剪刀 3.布");
        
        int player = sc.nextInt();
        switch(player){
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
    }
    
}
