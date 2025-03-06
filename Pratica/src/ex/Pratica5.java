package ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Pratica5 {

	public static void main(String[] args) {
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\";
		File meuArquivo = new File(local + "\\teste.txt");
		
		try {
			FileWriter out = new FileWriter(meuArquivo);
			byte a = (byte) System.in.read();
			
			while(a != '\n') {
				out.write(a);
				a = (byte) System.in.read();
				
			}
			out.close();
			
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não existente!");
			
		} catch(IOException e) {
			System.out.println("Erro de escrita...");
			
		}
		
	}
}
