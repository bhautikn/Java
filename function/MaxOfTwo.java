import java.util.Scanner;
public class MaxOfTwo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a: ");
		int a = sc.nextInt();
		System.out.print("enetr b: ");
		int b = sc.nextInt();
		FindMaxOfTwo(a,b);
	}
	static void FindMaxOfTwo(int a,int b){
		if (a>b) {
			System.out.print("a is bigger");
		}
		else{
			System.out.print("b is bigger");
		}
	}
}