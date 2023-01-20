import java.util.*;
public class PrimeOrNot{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter Number to find prime or not:");
		int a=s.nextInt();
		boolean p=true;
		for (int i=2;i<=a/2;i++) {
			if (a%i==0) {
				p=false;
				break;
			}
		}
		if (p) {
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	}
}