package com.example.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadastro.entity.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long>{

}
