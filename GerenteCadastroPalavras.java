import java.util.Map;

public class GerenteCadastroPalavras {
	private Map <String, Palavra> palavras;
	
	public boolean CadastraExercicio(String nomePalavra){
		Palavra p = this.palavras.get(nomePalavra);
		if(p == null){
			p = new Palavra(nomePalavra);
			this.palavras.put(nomePalavra, p);
			return true;
		}else{
			return false;
		}
	}
}
