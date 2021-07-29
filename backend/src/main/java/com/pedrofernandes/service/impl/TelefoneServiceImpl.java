package com.pedrofernandes.service.impl;

import com.pedrofernandes.service.TelefoneService;
import com.pedrofernandes.domain.Telefone;
import com.pedrofernandes.repository.TelefoneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link Telefone}.
 */
@Service
@Transactional
public class TelefoneServiceImpl implements TelefoneService {

    private final Logger log = LoggerFactory.getLogger(TelefoneServiceImpl.class);

    private final TelefoneRepository telefoneRepository;

    public TelefoneServiceImpl(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    /**
     * Save a telefone.
     *
     * @param telefone the entity to save.
     * @return the persisted entity.
     */
    @Override
    public Telefone save(Telefone telefone) {
        log.debug("Request to save Telefone : {}", telefone);
        return telefoneRepository.save(telefone);
    }

    /**
     * Get all the telefones.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<Telefone> findAll() {
        log.debug("Request to get all Telefones");
        return telefoneRepository.findAll();
    }


    /**
     * Get one telefone by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Telefone> findOne(Long id) {
        log.debug("Request to get Telefone : {}", id);
        return telefoneRepository.findById(id);
    }

    /**
     * Delete the telefone by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Telefone : {}", id);
        telefoneRepository.deleteById(id);
    }
}
