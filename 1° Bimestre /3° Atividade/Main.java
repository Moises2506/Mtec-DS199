package atividade3;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.000");
		
		Atividade3 usuarioPrimeiro = new Atividade3();
		System.out.println("Ol� "+usuarioPrimeiro.escrevaNome()+", voc� possui "+usuarioPrimeiro.escrevaIdade()+" anos, e seu peso � "+usuarioPrimeiro.escrevaPeso()+" e sua altura � "+usuarioPrimeiro.escrevaAltura()+". Logo, seu imc � "+deci.format(usuarioPrimeiro.calculoImc())+".");
		System.out.println(usuarioPrimeiro.tipoPeso());
		System.out.println();
		
		Atividade3 usuarioSegundo = new Atividade3();
		System.out.println("Ol� "+usuarioSegundo.escrevaNome()+", voc� possui "+usuarioSegundo.escrevaIdade()+" anos, e seu peso � "+usuarioSegundo.escrevaPeso()+" e sua altura � "+usuarioSegundo.escrevaAltura()+". Logo, seu imc � "+deci.format(usuarioSegundo.calculoImc())+".");
		System.out.println(usuarioSegundo.tipoPeso());
		System.out.println();

		Atividade3 usuarioTerceiro = new Atividade3();
		System.out.println("Ol� "+usuarioTerceiro.escrevaNome()+", voc� possui "+usuarioTerceiro.escrevaIdade()+" anos, e seu peso � "+usuarioTerceiro.escrevaPeso()+" e sua altura � "+usuarioTerceiro.escrevaAltura()+". Logo, seu imc � "+deci.format(usuarioTerceiro.calculoImc())+".");
		System.out.println(usuarioTerceiro.tipoPeso());
		System.out.println();
		
		Atividade3 usuarioQuarto = new Atividade3();
		System.out.println("Ol� "+usuarioQuarto.escrevaNome()+", voc� possui "+usuarioQuarto.escrevaIdade()+" anos, e seu peso � "+usuarioQuarto.escrevaPeso()+" e sua altura � "+usuarioQuarto.escrevaAltura()+". Logo, seu imc � "+deci.format(usuarioQuarto.calculoImc())+".");
		System.out.println(usuarioQuarto.tipoPeso());
		System.out.println();

	}

}
