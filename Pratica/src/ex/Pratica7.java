package ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Pratica7 {

	public static void main(String[] args) {
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\";
		File meuArquivo = new File(local + "\\Arquivo-binario");
		
		try {
			FileWriter fw = new FileWriter(meuArquivo);
			BufferedWriter out = new BufferedWriter(fw);
			
			out.write("Primeira linha" + "\n");
			out.write("Segunda linha" + "\n");
			out.write("Terceira linha" + "\n");

			out.close();
			fw.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não existente!");
			
		} catch(IOException e) {
			System.out.println("Erro de leitura...");
			
		}
		System.out.println("Escrita no arquivo texto finalizou!");
		
	}
}
