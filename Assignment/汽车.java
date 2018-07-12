package Vehicle;

public class Vehicle{
		 private int vehicleWeight;
		 private int velocity;
		 private int disPlacement = 0;
   
		 
		 
		//constructor有参构建
  public Vehicle (int size, int speed ) {
    	vehicleWeight = size;
    	velocity = speed;
    System.out.println("当前速度为:"+size+"\n"+"当前体积为:"+speed);
    }
     
  //加速
  public int speedUp(int Add) {
    	 velocity += Add;
         System.out.println("输出加速时的速度:"+Add);
    	 return Add;
     }
      
 //路程
  public int moVE(int distance) {
          disPlacement += distance;
          return distance;
       
}
   //减速       
       public boolean speedDown(int Minus) {
    	 boolean result = true;
    	  if (velocity >= Minus)	{
    	         velocity-=Minus;
    	         System.out.println("输出减速时的速度:"+Minus);
    	         return true;
    	       }
    	       return result;
     }
       
       
       
       
       
       
       public int getSpeed() {return velocity;}
       public int getSize() { return vehicleWeight; }
       public int getDistance() {return disPlacement;}





}
