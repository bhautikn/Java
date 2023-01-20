import java.util.*;
public class MaxOfThree{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a");
		int a=s.nextInt();
		System.out.println("enter b");
		int b=s.nextInt();
		System.out.println("enetr c");
		int c=s.nextInt();
		if (a>b) {
			if (a>c) {
				System.out.println("a is bigger");				
			}
			else{
				System.out.println("c is bigger");
			}
		}
		else {
			if (b>c) {
				System.out.println("b is bigger");
			}
			else{
				System.out.println("c is bigger");
			}
		}
	}
}