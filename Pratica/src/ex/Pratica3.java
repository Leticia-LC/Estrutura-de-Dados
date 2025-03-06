package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pratica3 {

	public static void main(String[] args) {
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\";
		File meuArquivo = new File(local + "\\teste.txt");
		
		try {
			FileReader r = new FileReader(meuArquivo);
			
			int c;
			
			while((c = r.read()) != -1) {
				System.out.println("Li o caractere: " + c);
				
			}
			r.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não existente!");
			
		} catch(IOException e) {
			System.out.println("Erro na leitura...");
			
		}
		
	}

}
