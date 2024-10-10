package com.br.HairPass.service;

import com.br.HairPass.model.Cabeleireiro;
import com.br.HairPass.repository.CabeleireiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabeleireiroService {

    @Autowired
    private CabeleireiroRepository cabeleireiroRepository;

    public Cabeleireiro saveCabeleireiro(Cabeleireiro cabeleireiro) {
        return cabeleireiroRepository.save(cabeleireiro);
    }

    public List<Cabeleireiro> getAllCabeleireiros() {
        return cabeleireiroRepository.findAll();
    }

    public Optional<Cabeleireiro> getCabeleireiroById(Long id) {
        return cabeleireiroRepository.findById(id);
    }

    public void deleteCabeleireiro(Long id) {
        cabeleireiroRepository.deleteById(id);
    }
}
