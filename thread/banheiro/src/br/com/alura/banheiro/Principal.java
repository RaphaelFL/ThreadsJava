package br.com.alura.banheiro;

public class Principal {

	public static void main(String[] args) {
		
		Banheiro banheiro = new Banheiro();
		
		Thread convidado = new Thread(new TarefaNumero1(banheiro), "joão");
		Thread convidado1 = new Thread(new TarefaNumero2(banheiro), "pedro");
		
		
		convidado.start();
		convidado1.start();
	}
	
}
