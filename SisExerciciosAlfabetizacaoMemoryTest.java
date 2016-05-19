package br.ufpb.projeto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SisExerciciosAlfabetizacaoMemoryTest {
	SisExerciciosAlfabetizacao sis;
	@Before
	public void setUp() throws Exception {
		sis = new SisExerciciosAlfabetizacaoMemory();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void SisExerciciosAlfabetizacaotest() throws PalavraJaExisteException {
		sis.cadastraExercicioImagemPalavra("casa");
		sis.cadastrarExercicioCompletarPalavra("lua");
	}

}
