package Vehicle;


public class Testvehicle {

	 public static void main(String[] args) {
 Vehicle a = new Vehicle(5 , 3);
a.moVE(1);
System.out.println("输出移动速度的距离:"+a.getDistance());
 a.speedUp(4);
 a.speedDown(1); 
 System.out.println("此时的速度为:"+a.getSpeed()); 
		  
		  
		  
  }
}
