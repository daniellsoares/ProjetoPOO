package br.ufpb.projeto.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import br.ufpb.projeto.Palavra;

public class GerenteCadastroDePalavrasArquivo {
public static final String ARQUIVO_DEFAULT = "cadastroPalavras.txt";	
	
	private String nomeArquivo;
	public GerenteCadastroDePalavrasArquivo(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}
	public GerenteCadastroDePalavrasArquivo(){
		this.nomeArquivo = ARQUIVO_DEFAULT;
	}
	public void gravaPalavras(Map <String,Palavra> mapaPal) throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
			out.writeObject(mapaPal);
		}finally{
			if(out != null){
				out.close();
			}
		}
		
	}
	public Map<String,Palavra> lePalavras() throws  IOException, ClassNotFoundException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream(nomeArquivo));
			return (Map <String,Palavra>)in.readObject();
		}catch(ClassNotFoundException e){
			throw new IOException(e);
			
		}finally{
			if(in != null){
				in.close();
			}
		}
	}
	

}