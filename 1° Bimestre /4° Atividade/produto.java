package encapsulamento;
import java.util.Scanner;
public class produto {
	String nome;
	double precoCusto;
	double precoVenda;
	double margemLucro;
	
//----------------------------------------------------------------------------------	
	
String getNome() {
	return this.nome;
}
	
void setNome (String nome) {
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o nome do produto?");
	nome = in.next();
	this.nome = nome;
}
	
//----------------------------------------------------------------------------------
	
double getPrecoCusto() {
		return this.precoCusto;
}
	
void setPrecoCusto (double PrecoCusto) {
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o pre�o de custo?");
	precoCusto = in.nextDouble();

	this.precoCusto = precoCusto;
}
	
//----------------------------------------------------------------------------------	
	
double getPrecoVenda() {
	
	return this.precoVenda;
}
	
void setPrecoVenda (Double precoVenda) {
	Scanner in = new Scanner(System.in);
	System.out.println("Qual o pre�o de venda?");
	precoVenda = in.nextDouble();
	
		
if (precoVenda < precoCusto) {
	System.out.println("ATEN��O!!!");
	System.out.println("O PRE�O DE VENDA N�O PODE SER INFERIOR AO PRE�O DE CUSTO.");
			
}

this.precoVenda = precoVenda;
			
}
	
//----------------------------------------------------------------------------------	
	
double getMargemLucro() {
	
	return this.margemLucro;
	
}
	

void calcularMargemLucro(double precoVenda, double precoCusto) {
	this.margemLucro = precoVenda - precoCusto;
}

double getPorcentagemMargemLucro() {
	return margemLucro = (margemLucro/precoVenda)*100;
}



}
