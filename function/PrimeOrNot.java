import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter no to check Prime Or Not: ");
		int n = sc.nextInt();
		if(check(n)){
			System.out.print("number is prime");
		}
		else {
			System.out.print("number is not prime");
		}
	}
	static boolean check(int n){
		for (int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
}