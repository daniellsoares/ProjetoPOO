package br.ufpb.projeto;

import java.io.Serializable;
import java.util.Map;

public class Palavra implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private Map <String,Palavra> palavras;
	
	public Palavra(String nome){
		this.setNome(nome);
		this.setPalavras(getPalavras());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map <String,Palavra> getPalavras() {
		return palavras;
	}

	public void setPalavras(Map <String,Palavra> palavras) {
		this.palavras = palavras;
	}
	
}
