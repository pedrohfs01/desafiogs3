package com.pedrofernandes.service;

import com.pedrofernandes.domain.Telefone;

import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Telefone}.
 */
public interface TelefoneService {

    /**
     * Save a telefone.
     *
     * @param telefone the entity to save.
     * @return the persisted entity.
     */
    Telefone save(Telefone telefone);

    /**
     * Get all the telefones.
     *
     * @return the list of entities.
     */
    List<Telefone> findAll();


    /**
     * Get the "id" telefone.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Telefone> findOne(Long id);

    /**
     * Delete the "id" telefone.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
