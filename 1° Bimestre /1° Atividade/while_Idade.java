package revisao_1_Completo;
import java.util.Scanner;
public class while_Idade {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);
		int anoNasci, anoAtual, idade;
		String resposta;
		do {
			
			System.out.println("Escreva o ano de nascimento.");
			anoNasci = ler.nextInt();
			
			System.out.println("Escreva o ano atual.");
			anoAtual = ler.nextInt();
			
			idade = anoAtual - anoNasci;
			
			System.out.println("A sua idade � "+ idade +" anos.");
			
			if (idade>=18) {
				System.out.println("Voc� � maior de idade.");
			} else{
				System.out.println("Voc� � menor de idade.");
			}
			System.out.println("Deseja calcular a idade de mais uma pessoa? Responda com sim ou n�o.");
			resposta = ler.next();
			
		}while(resposta.equals("sim"));
		ler.close();
	}

}
