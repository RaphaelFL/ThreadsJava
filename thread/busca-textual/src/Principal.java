
public class Principal {
	
	public static void main(String[] args) {
		
		String nome = "Jhon";
		
		Thread threadAssi = new Thread( new Tarefabus("assinaturas1.txt", nome));
		Thread threadAssi1 = new Thread(new Tarefabus("assinatura2.txt", nome));
		Thread threadAuto = new Thread(new Tarefabus("autores.txt", nome));
		
		threadAssi.start();
		threadAssi1.start();
		threadAuto.start();
	}
}
