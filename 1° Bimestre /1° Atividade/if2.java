package revisao_1_Completo;
import java.util.Scanner;
public class if2 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int x, im_Par;
		System.out.println("Entre com um n�mero inteiro:");
 		x= ler.nextInt();
		im_Par= x%2;
		System.out.println("O n�mero inteiro "+x);
		if (im_Par==0) {
			System.out.println("� par.");
		}else {
			System.out.println("� impar.");
		}
		ler.close();

	}

}
