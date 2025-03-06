package ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pratica4 {
	public static void main(String[] args) {
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\";
		File meuArquivo = new File(local + "\\teste.txt");
		
		try {
			FileReader r = new FileReader(meuArquivo);
			BufferedReader in = new BufferedReader(r);
			String linha = in.readLine();
			
			while(linha != null) {
				System.out.println(linha);
				linha = in.readLine();
				
			}
			in.close();
			r.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não existente!");
			
		} catch(IOException e) {
			System.out.println("Erro na leitura...");
			
		}
		
	}

}
