package ex;

import java.io.File;

public class Pratica1 {
	
	public static void main(String[] args) {
		
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\";
		File meuArquivo = new File(local + "teste.txt");
		
		if(meuArquivo.exists()) {
			System.out.println("Path do arquivo " + meuArquivo.getAbsolutePath());
			
			System.out.println("Tamanho: " + meuArquivo.length());
			
			System.out.println("pode ser escrito? " + meuArquivo.canWrite());
			
		} else {
			System.out.println("Arquivo não existe");
			
		}
	}

}
