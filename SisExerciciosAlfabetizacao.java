package br.ufpb.projeto;

public interface SisExerciciosAlfabetizacao {
	public void cadastraExercicioImagemPalavra(String nomePalavra) throws PalavraJaExisteException;
	
	public void cadastrarExercicioCompletarPalavra(String palavra) throws PalavraJaExisteException;

}
