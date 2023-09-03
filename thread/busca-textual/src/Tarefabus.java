import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tarefabus implements Runnable {

	private String nomeArquivo;
	private String nome;

	public Tarefabus(String nomeArquivo, String string) {
		this.nomeArquivo = nomeArquivo;
		this.nome = string;

	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(nomeArquivo));
			int numeroLinha = 1;
			while(scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if(linha.contains(nome)) {
					System.out.println( nomeArquivo + " - " + numeroLinha + " - " + linha);
				}
				
				numeroLinha++;
			}
			
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

}
