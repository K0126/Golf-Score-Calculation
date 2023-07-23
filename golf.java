package acsl;
import java.util.Scanner;


public class golf {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			 for (int i = 0; i < 4; i++) {
		          int gameScore = scanner.nextInt(); // 게임 스코어
		          int myScore = scanner.nextInt(); // 자신의 스코어
		          
		          int calc = gameScore - myScore; // 게임 스코어 - 자신의 스코어
		          
		          if (calc == 0) {
		        	  System.out.println("par"); 
		          }
		          else if (calc == 1) {
		        	  System.out.println("birdie");
		          }
		          else if (calc == 2) {
		        	  System.out.println("eagle");
		          }
		          else if (calc == -1) {
		        	  System.out.println("bogey");
		          }
		          else if (calc == -2) {
		        	  System.out.println("double bogey");
		          }
		          
			
			
			
			
			 }
				
	}

}
