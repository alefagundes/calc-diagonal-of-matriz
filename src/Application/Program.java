package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Inform index of matriz that you wish:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		int quantitie=0;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]<0) {
					quantitie++;
				}
			}
		}
		System.out.println("Main Diagonal:");
		for(int i=0;i<n;i++) {
			System.out.print(mat[i][i] + ", " );
		}
		System.out.println();
		System.out.println("Quantitie elemnts < null:" + quantitie);
		sc.close();
	}
}
