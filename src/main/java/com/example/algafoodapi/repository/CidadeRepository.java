package com.example.algafoodapi.repository;

import java.util.List;

import com.example.algafoodapi.model.Cidade;

public interface CidadeRepository {

	List<Cidade> listar();
	Cidade buscar(Long id);
	Cidade salvar(Cidade cidade);
	void remover(Cidade cidade);

}
