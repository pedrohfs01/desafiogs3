package com.pedrofernandes.repository;

import com.pedrofernandes.domain.Endereco;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Endereco entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
