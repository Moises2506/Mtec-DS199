package revisao_1_Completo;
import java.util.Scanner;
public class matriz_Nota {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int a[][] = new int[3][4];
		int i, j, l=1;
		a[0][0] = 2; 
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				System.out.println("Escreva as notas do aluno "+(i+1)+".");
				a[i][j] = in.nextInt();

			}
		}
		
		for(i=0;i<3;i++) {
			
			
			for(j=0;j<4;j++) {
				System.out.print( "["+ a[i][j]+ "] ");
			
			}
			System.out.println("-> Notas do aluno "+(i+1));
		}
		in.close();

	}
}