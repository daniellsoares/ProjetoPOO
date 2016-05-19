
public class ExercicioAssociacao implements CadastraExercicio {
	private String reposta;
	/**
	 * 
	 * @param resposta adicionar qual o tipo de letra que sera utilizada na classe
	 */
	public ExercicioAssociacao(String resposta){
		this.setReposta(resposta);
	}
	@Override
	public void cadastraExercio(Palavra p) {
		// TODO Auto-generated method stub

	}
	public String getReposta() {
		return reposta;
	}
	public void setReposta(String reposta) {
		this.reposta = reposta;
	}

}
