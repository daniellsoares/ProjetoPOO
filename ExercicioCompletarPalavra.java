
public class ExercicioCompletarPalavra implements CadastraExercicio {
	private String letra;
	/**
	 * 
	 * @param resposta adicionar qual o tipo de letra que sera utilizada na classe
	 */
	public ExercicioCompletarPalavra(String letra){
		this.setLetra(letra);
	}
	
	@Override
	public void cadastraExercio(Palavra p) {
		// TODO Auto-generated method stub

	}

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

}
