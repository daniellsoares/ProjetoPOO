
public class CadastraExercicioMemory implements CadastraExercicio {
	private GerenteCadastroPalavras gerenteExercicio;
	
	public CadastraExercicioMemory () throws ClassNotFoundException{
		this.gerenteExercicio = new GerenteCadastroPalavras();
	}
	public void cadastraExercio(Palavra p) {
		gerenteExercicio.CadastraExercicio(nomePalavra);

	}

}
