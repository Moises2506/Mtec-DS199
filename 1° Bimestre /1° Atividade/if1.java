package revisao_1_Completo;
import java.util.Scanner;
public class if1 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x;
		System.out.println("Entre com um n�mero inteiro:");
 		x= ler.nextInt();
 		System.out.println("O n�mero inteiro "+x);
 		if (x>0) {
			System.out.println("� positivo.");
		}else if (x==0) {
			System.out.println("� neutro.");
		}else {
			System.out.println("� negativo.");
		}
		ler.close();
	}

}
