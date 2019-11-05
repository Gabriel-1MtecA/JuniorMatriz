import java.util.Scanner;
public class Exercicio1{
	public static void main (String args[]){
		Scanner in= new Scanner (System.in);
		int n,i,j;
		System.out.println("Digite um valor inteiro:");
		n=in.nextInt();
		int v[][] = new int [n][n];
		for (i=0; i<n; i++){
			for(j=0; j<n; j++){
			System.out.println("Digite o valor da linha "+(i+1)+" , coluna "+(j+1));
			v[i][j]=in.nextInt();
			}}
		for (i=0; i<n; i++){
			for(j=0; j<n; j++){
				System.out.print(v[i][j]+" ");	
			}
			System.out.print("\n");
			}
		System.out.println(" ");
		System.out.println("Valores da diagonal:");
			for(j=0; j<n; j++){
				System.out.println(v[j][j]);
				}
	}
}