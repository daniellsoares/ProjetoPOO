package br.ufpb.projeto;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import br.ufpb.projeto.persistencia.GerenteCadastroDePalavrasArquivo;
import br.ufpb.projeto.persistencia.SisExerciciosAlfabetizacaoException;

public class GerenteCadastroDePalavras {
	private Map<String,Palavra> palavras;
	private GerenteCadastroDePalavrasArquivo gravador = new GerenteCadastroDePalavrasArquivo();
	
	public GerenteCadastroDePalavras() throws ClassNotFoundException{
		try{
			this.palavras = gravador.lePalavras();
		}catch (IOException e){
			System.out.println("Não existe palavra cadastrado ainda. Iniciando nova lista de palavras");
			this.palavras = new HashMap <String,Palavra>();
		}
	}
	public boolean cadastraExercicioImagemPalavra(String nomePalavra){
		Palavra p = this.palavras.get(nomePalavra);
		if(p == null){
			p = new Palavra(nomePalavra);
			this.palavras.put(nomePalavra, p);
			return true;
		}else{
			return false;
		}
	}
		
	public void removerPalavra(String nomePalavra){
		for(Palavra m: palavras.values()){
			if(m.getNome().equalsIgnoreCase(nomePalavra)){
				this.palavras.remove(nomePalavra);
			}
		}
	}
	
	public void salvarDados() throws SisExerciciosAlfabetizacaoException{
		try {
			this.gravador.gravaPalavras(palavras);
		} catch (IOException e) {
			throw new SisExerciciosAlfabetizacaoException("Nao foi possivel gravar dados"+e.getMessage()); 
			
		}
	}
	public boolean cadastrarExercicioCompletarPalavra(String palavra) {
		Palavra p =this.palavras.get(palavra);
		if(p == null){
			p = new Palavra(palavra);
			this.palavras.put(palavra, p);
			return true;
		}else{
			return false;
		}
	}
}

