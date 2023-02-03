import java.util.Scanner;
public class SimplIntrest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter principal: ");
		float p = sc.nextFloat();
		System.out.print("enetr rate: ");
		int r = sc.nextInt();
		System.out.print("enter n: ");
		int n = sc.nextInt();
		double intrest=SIntrest(p,r,n);
		System.out.print("total intrest is: "+intrest);
	}
	static double SIntrest(float p,int r,int n){
		double total = p*r*n;
		return total;
	}
}