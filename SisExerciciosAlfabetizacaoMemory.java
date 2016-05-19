package br.ufpb.projeto;

public class SisExerciciosAlfabetizacaoMemory implements SisExerciciosAlfabetizacao{
	private GerenteCadastroDePalavras gerenteCadastroPalavras;
	
	public SisExerciciosAlfabetizacaoMemory() throws ClassNotFoundException {
		this.gerenteCadastroPalavras = new GerenteCadastroDePalavras ();
	}
	public void cadastraExercicioImagemPalavra(String nomePalavra) throws PalavraJaExisteException {
		gerenteCadastroPalavras.cadastraExercicioImagemPalavra(nomePalavra);
		
	}
	@Override
	public void cadastrarExercicioCompletarPalavra(String palavra) throws PalavraJaExisteException {
		gerenteCadastroPalavras.cadastrarExercicioCompletarPalavra(palavra);
		
	}


}
