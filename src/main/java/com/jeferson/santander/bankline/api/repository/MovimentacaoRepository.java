package com.jeferson.santander.bankline.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeferson.santander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long>{
	 public List<Movimentacao>findByIdConta(Integer idConta);
}
