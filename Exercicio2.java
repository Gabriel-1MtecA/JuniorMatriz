import java.util.Scanner;
public class Exercicio2{
	public static void main (String args[]){
		Scanner in= new Scanner (System.in);
		int m,n,i,j,va;
		System.out.println("Digite o valor de 'm'");
		m=in.nextInt();
		System.out.println("Digite o valor de 'n'");
		n=in.nextInt();
		int v[][] = new int [m][n];
		for (i=0; i<m; i++){
			for(j=0; j<n; j++){
			System.out.println("Digite o valor da linha "+(i+1)+" , coluna "+(j+1));
			v[i][j]=in.nextInt();
			}}
		for (i=0; i<m; i++){
			for(j=0; j<n; j++){
				System.out.print(v[i][j]+" ");	
			}
			System.out.print("\n");
			}
}
}