package com.delegrego.api_alunos.service;

import java.time.LocalDate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.delegrego.api_alunos.dto.AlunoRequest;
import com.delegrego.api_alunos.dto.AlunoResponse;

public class AlunoServiceTest {

	private AlunoService service;

	@Test
	void deveCadastrarAlunoQuandoDadosForemValidos() {
		// Arrange
		service = new AlunoService();

		AlunoRequest request = new AlunoRequest("Henrique", "henrique@email.com", "senha", LocalDate.of(2001, 10, 11),
				8);

		// Act
		AlunoResponse response = service.cadastrarAluno(request);

		// Assert
		Assertions.assertThat(response).isNotNull();
		Assertions.assertThat(response.getId()).isGreaterThan(0);

	}

}
