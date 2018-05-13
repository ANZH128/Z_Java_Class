import java.util.Scanner;
public class average {
//EDIT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner stdin = new Scanner(System.in);
String inString;
int i, num,sum = 0;
for (i=1;i<=3;i++) {
System.out.println("Enter mark of assign"+i+":");
inString = stdin.next();
num = Integer.parseInt(inString);
sum += num;
}
System.out.println("The average is"+ (double) sum /3);	
	}
}
	
	
