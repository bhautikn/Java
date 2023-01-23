import java.util.*;
public class Sqare_Pattern{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enetr number of size of pattern:");
		int n=sc.nextInt();
		for (int i=0;i<=n;i++){
			for (int j=0;j<=n;j++) {
				if (i==0||j==0||j==n||i==n) {
					System.out.print(n+" ");
				}
				else if (i==1||j==1||j==n-1||i==n-1) {
					System.out.print(n-1+" ");
				}
				else if(i==2||j==2||j==n-2||i==n-2){
					System.out.print(n-2+" ");
				}
				else if(i==3||j==3||j==n-3||i==n-3){
					System.out.print(n-3+" ");
				}
				else if(i==4||j==4||j==n-4||i==n-4){
					System.out.print(n-4+" ");
				}
			}
			System.out.print("\n");
		}
	}
}