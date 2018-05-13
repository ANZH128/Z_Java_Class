/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shidaojiandaobudemo;

/**
 *
 * @author Antoine-Desktop
 */
public class Pyramid {
    public static void main(String[] args){
        System.out.println("金字塔");  
        fullPyramid(100);  
        
        System.out.println("空心金字塔");  
        hollowPyramid();  
        
        System.out.println("菱形");  
        fullDiamond(); 
        
        System.out.println("空心菱形");  
        hollowDiamond(); 
    }
    public static void fullPyramid(int layer){
        //int layer = 5;
        for(int i = 1; i<=layer;i++){
            //空格
            for(int k=1; k <= layer - i ;k++){
                System.out.print(" ");
            }
            
            for(int j = 1;j<=(i-1)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    
    //空心金字塔
    public static void hollowPyramid(){
        //...
    }
    
    //菱形
    public static void fullDiamond(){
        //...
    }
    
    //空心菱形
    public static void hollowDiamond(){
        //...
    }
    
    
}
