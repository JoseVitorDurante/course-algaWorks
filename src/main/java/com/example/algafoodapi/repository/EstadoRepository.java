package com.example.algafoodapi.repository;

import java.util.List;

import com.example.algafoodapi.model.Estado;

public interface EstadoRepository {

	List<Estado> listar();
	Estado buscar(Long id);
	Estado salvar(Estado estado);
	void remover(Estado estado);

}
