package ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersistindoObjetos {
	
	public void main(String[] args) throws Exception {
		Pessoa p1 = new Pessoa("Matheus", 65);
		Pessoa p2 = new Pessoa("Amanda", 49);
		
		int valor = 1000;
		
		String local = "C:\\Users\\leticia_l_cunha\\Documents\\novo\\";
		File arquivo = new File (local + "pessoas.dat");
		
		FileOutputStream fileOutputStream  = new FileOutputStream (arquivo);
		ObjectOutputStream objOutStream = new ObjectOutputStream(fileOutputStream);
		
		objOutStream.writeInt(valor);
		objOutStream.writeObject(p1);
		objOutStream.writeObject(p2);
		
		objOutStream.close();
		fileOutputStream.close();
		
		FileInputStream fileInputStream = new FileInputStream(arquivo);
		ObjectInputStream objInStream = new ObjectInputStream(fileInputStream);
		
		System.out.println(objInStream.readInt());
		System.out.println(objInStream.readObject());
		System.out.println(objInStream.readObject());
		
		objInStream.close();
		fileInputStream.close();
		
				
	}

}
