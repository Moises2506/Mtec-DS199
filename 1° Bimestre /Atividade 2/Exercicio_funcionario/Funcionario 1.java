package ds_Funcionario;

import java.util.Scanner;

public class Funcionario {
	String nome;
	Double salarioBruto;
	Double Imposto;
	
	Double salarioLiquido() {
		Double a = (salarioBruto*15)/100;
		Double salarioLiquido = salarioBruto - a;
		return salarioLiquido;
	}
	Double aumentaSalario() {
		Scanner in = new Scanner(System.in);
		System.out.println("Para aumentar seu sal�rio, informe o valor que voc� deseja que seja adicionado ao seu sal�rio bruto:");
		Double b = in.nextDouble();
		Double aumentaSalario = salarioBruto + b;
		return aumentaSalario;
	}

}

