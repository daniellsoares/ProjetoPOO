
public class ExercicioAssociacao implements CadastraExercicio {
	private String reposta;
	
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
