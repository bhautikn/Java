import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter n: ");
		int n= sc.nextInt();
		FibonacciSeries(n);
	}
	static void FibonacciSeries(int n){
		int temp1=1,temp=0,total=0;
		for (int i=0;i<=n;i++) {
			temp=total;
			System.out.print(total+" ");
			total=temp1+temp;
			temp1=temp;
		}
	}
}