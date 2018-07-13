package Transport;
	abstract class Transport{	 //定义抽象方法交通工具
		abstract void Moving() ;
	}

	class Car extends Transport{  //定义Car类
		public void Moving(){
			System.out.println("汽车:在马路上驾驶");
		}
	}
	 
	class Train extends Transport{      //定义Train类
		public void Moving(){
			System.out.println("火车:在铁路上驾驶");
		}
	}
	 
	class Plane extends Transport{     //定义Plane类
		public void Moving(){
			System.out.println("飞机:在天上驾驶");
		}
	 
	}


