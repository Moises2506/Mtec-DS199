package imcEncapsulamento;
import java.text.DecimalFormat;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat deci = new DecimalFormat("0.000");
		
		encapsulamentoImc usuarioPrimeiro = new encapsulamentoImc();
		System.out.println("Ol� "+usuarioPrimeiro.getEscrevaNome()+", voc� possui "+usuarioPrimeiro.getEscrevaIdade()+" anos, e seu peso � "+usuarioPrimeiro.getEscrevaPeso()+" e sua altura � "+usuarioPrimeiro.getEscrevaAltura()+". Logo, seu imc � "+deci.format(usuarioPrimeiro.calculoImc())+".");
		System.out.println(usuarioPrimeiro.tipoPeso());
		System.out.println();
		
		encapsulamentoImc usuarioSegundo = new encapsulamentoImc();
		System.out.println("Ol� "+ usuarioSegundo.getEscrevaNome()+", voc� possui "+ usuarioSegundo.getEscrevaIdade()+" anos, e seu peso � "+ usuarioSegundo.getEscrevaPeso()+" e sua altura � "+ usuarioSegundo.getEscrevaAltura()+". Logo, seu imc � "+deci.format( usuarioSegundo.calculoImc())+".");
		System.out.println( usuarioSegundo.tipoPeso());
		System.out.println();

		encapsulamentoImc usuarioTerceiro = new encapsulamentoImc();
		System.out.println("Ol� "+ usuarioTerceiro.getEscrevaNome()+", voc� possui "+ usuarioTerceiro.getEscrevaIdade()+" anos, e seu peso � "+ usuarioTerceiro.getEscrevaPeso()+" e sua altura � "+ usuarioTerceiro.getEscrevaAltura()+". Logo, seu imc � "+deci.format( usuarioTerceiro.calculoImc())+".");
		System.out.println(usuarioTerceiro.tipoPeso());
		System.out.println();
		
		encapsulamentoImc usuarioQuarto = new encapsulamentoImc();
		System.out.println("Ol� "+usuarioQuarto.getEscrevaNome()+", voc� possui "+usuarioQuarto.getEscrevaIdade()+" anos, e seu peso � "+usuarioQuarto.getEscrevaPeso()+" e sua altura � "+usuarioQuarto.getEscrevaAltura()+". Logo, seu imc � "+deci.format(usuarioQuarto.calculoImc())+".");
		System.out.println(usuarioQuarto.tipoPeso());
		System.out.println();


		
	}

}
