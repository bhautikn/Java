import java.util.Scanner;

public class CriketMatch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int match[][]= 	new int[3][6];
		int total=0;
		for (int i=0;i<match.length;i++) {
			for (int j=0;j<match[i].length;j++) {
				System.out.print("enter run of over "+i+" of ball "+j+" : ");
				match[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<match.length;i++) {
			for (int j=0;j<match[i].length;j++) {
				total=total+match[i][j];
			}
		}
		System.out.print("total run is: "+total+"\n");
	}
}