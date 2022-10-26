package com.example.algafoodapi.repository;

import java.util.List;
import com.example.algafoodapi.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);

}
