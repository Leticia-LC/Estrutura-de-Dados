package ex;

import java.io.File;
import java.io.IOException;

public class Pratica2 {

	public static void main(String[] args) {
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\";
		
		File diretorio = new File(local + "novo");
		diretorio.mkdir();
		
		File subDir1 = new File(diretorio, "subdir1");
		File subDir2 = new File(diretorio, "subdir2");
		subDir1.mkdir();
		subDir2.mkdir();
		
		File arquivo = new File(diretorio, "arquivoVazio.txt");
		
		if(!arquivo.exists()) {
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		String arquivos[] = diretorio.list();
		for(String nome : arquivos) {
			File filho = new File(diretorio, nome);
			if(filho.isDirectory()) {
				System.out.println("[X] ");
				
			} else {
				System.out.println("[] ");
				
			}
			System.out.println(filho.getAbsolutePath());
			
		}
		

	}

}
