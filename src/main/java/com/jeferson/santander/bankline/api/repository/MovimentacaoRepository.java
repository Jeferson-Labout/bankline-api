package com.jeferson.santander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeferson.santander.bankline.api.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long>{

}