package filmesAtividade_Ds;

import java.text.DecimalFormat;

public class testarFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.00");
		
		filme filme1 = new filme();
		
		System.out.println("Primeiro filme:");
		filme1.setNome("Os Vingadores");
		filme1.setMinutoDuracao(142);

		System.out.println("");
		System.out.println("T�tulo: "+filme1.getNome()+".");
		System.out.println("Tempo de dura��o (minutos): "+filme1.getMinutoDuracao()+".");
		System.out.println("Tempo de dura��o (horas): "+filme1.horaDuracao(filme1.minutoDuracao)+".");
		System.out.println("");
		
//----------------------------------------------------------------------------------------------------------------------------------

		filme filme2 = new filme();

		System.out.println("Segundo Filme:");
		filme2.setNome("Hotel Transilv�nia");
		filme2.setMinutoDuracao(93);

		System.out.println("");
		System.out.println("T�tulo: "+filme2.getNome()+".");
		System.out.println("Tempo de dura��o (minutos): "+filme2.getMinutoDuracao()+".");
		System.out.println("Tempo de dura��o (horas): "+filme2.horaDuracao(filme2.minutoDuracao)+".");
		System.out.println("");
		
//----------------------------------------------------------------------------------------------------------------------------------

		filme filme3 = new filme();
		        
		System.out.println("Terceiro filme:");
		filme3.setNome("Avatar");
		filme3.setMinutoDuracao(162);

		System.out.println("");
		System.out.println("T�tulo: "+filme3.getNome()+".");
		System.out.println("Tempo de dura��o (minutos): "+filme3.getMinutoDuracao()+".");
		System.out.println("Tempo de dura��o (horas): "+filme3.horaDuracao(filme3.minutoDuracao)+".");
		System.out.println("");
		
//----------------------------------------------------------------------------------------------------------------------------------

		filme filme4 = new filme();
		        
		System.out.println("Quarto filme:");
		filme4.setNome("Star Wars: O Despertar da For�a");
		filme4.setMinutoDuracao(136);

		System.out.println("");
		System.out.println("T�tulo: "+filme4.getNome()+".");
		System.out.println("Tempo de dura��o (minutos): "+filme4.getMinutoDuracao()+".");
		System.out.println("Tempo de dura��o (horas): "+filme4.horaDuracao(filme4.minutoDuracao)+".");
		System.out.println("");
		
//----------------------------------------------------------------------------------------------------------------------------------

		filme filme5 = new filme();
		        
		System.out.println("Quinto filme:");
		filme5.setNome("O Rei Le�o");
		filme5.setMinutoDuracao(120);

		System.out.println("");
		System.out.println("T�tulo: "+filme5.getNome()+".");
		System.out.println("Tempo de dura��o (minutos): "+filme5.getMinutoDuracao()+".");
		System.out.println("Tempo de dura��o (horas): "+filme5.horaDuracao(filme5.minutoDuracao)+".");
		System.out.println("");
		}

}















