package com.example.algafoodapi.repository;

import com.example.algafoodapi.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

	List<Permissao> listar();
	Permissao buscar(Long id);
	Permissao salvar(Permissao permissao);
	void remover(Permissao permissao);

}
