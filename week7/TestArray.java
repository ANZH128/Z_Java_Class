public class TestArray {
public static void main(String[] args) {
		// TODO Auto-generated method stub
          double[] mylist = {1.9 , 2.9 , 3.4 , 3.5};
          //打印所有元素
          for(int i = 0; i < mylist.length;i++){
              System.out.println(mylist[i]);
          }
         
          //计算元素的合
          Double temp = 0.0;
          for(int i = 0; i < mylist.length;i++){
              temp = temp + mylist[i];
          }
          System.out.println(temp);
		
	  // 查找最大元素和最小元素
          double max = mylist[0];
          double min = mylist[0];
             for(int i = 0; i < mylist.length;i++){
              if(max<mylist[i]){
                  max = mylist[i];
              }
              
              if(min>mylist[i]){
                  min=mylist[i];
              }
          }
          
             System.out.println("最大值是"+max+" 最小值是"+min);      
 }
}
