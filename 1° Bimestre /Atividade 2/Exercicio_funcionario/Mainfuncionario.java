package ds_Funcionario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario primeiroPedro = new Funcionario();
		primeiroPedro.salarioBruto = 3481.66;
		System.out.println("Funcion�rio Pedro, o seu s�lario l�quido �: R$"+primeiroPedro.salarioLiquido()+".");
		System.out.println("Funcion�rio Pedro, o seu sal�rio bruto com o aumento �: R$"+primeiroPedro.aumentaSalario()+".");
		System.out.println();



		Funcionario segundoVagner = new Funcionario();
		segundoVagner.salarioBruto = 3740.92;
		System.out.println("Funcion�rio Vagner, o seu s�lario l�quido �: R$"+segundoVagner.salarioLiquido()+".");
		System.out.println("Funcion�rio Vagner, o seu sal�rio bruto com o aumento �: R$"+segundoVagner.aumentaSalario()+".");


	}

}
