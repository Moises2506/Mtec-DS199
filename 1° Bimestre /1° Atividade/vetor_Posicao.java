package revisao_1_Completo;
import java.util.Scanner;
public class vetor_Posicao {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		final int TAM=6;
		int valor[], i=0;
		valor = new int[TAM];
		
		for(i=0; i<TAM; i++){
			System.out.println("Escreva o "+ (i+1) +"� valor inteiro.");
			valor[i]=ler.nextInt();
	
			
		}
		
		for(i=0; i<TAM; i++){
			System.out.println("Na posi��o "+i+" teremos o valor "+ valor [i]+".");

	
			
		}
		ler.close();

	}

}