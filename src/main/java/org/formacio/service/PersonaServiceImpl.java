package org.formacio.service;

import org.formacio.domain.Persona;
import org.formacio.repositori.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class PersonaServiceImpl {

    @Autowired
    private PersonaRepository personaRepository;

    public Optional<Persona> carrega(Long codi) {
        return personaRepository.findById(codi);
    }
}
