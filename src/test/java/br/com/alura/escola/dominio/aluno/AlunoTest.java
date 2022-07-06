package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {

	private Aluno aluno;
	private String ddd = "11";
	private String numero = "123456789";
	
	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(
				new CPF("123.123.123-90"),
				"fulano de tal",
				new Email("fulano@fulano.com"));
	}
	
	@Test
	void deveriaPermitirAdicionar1Telefone() {
		this.aluno.adicionarTelefone(ddd, numero);
		assertEquals(1, this.aluno.getTelefones().size());
	}

	@Test
	void deveriaPermitirAdicionar2Telefone() {
		this.aluno.adicionarTelefone(ddd, numero);
		this.aluno.adicionarTelefone(ddd, numero);
		assertEquals(2, this.aluno.getTelefones().size());
	}
	
	@Test
	void naoDeveriaPermitirAdicionar3Telefones() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.aluno.adicionarTelefone(ddd, numero);
			this.aluno.adicionarTelefone(ddd, numero);
			this.aluno.adicionarTelefone(ddd, numero);
		});
	}
	
}
