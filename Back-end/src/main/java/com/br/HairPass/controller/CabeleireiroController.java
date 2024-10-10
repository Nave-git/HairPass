package com.br.HairPass.controller;

import com.br.HairPass.model.Cabeleireiro;
import com.br.HairPass.service.CabeleireiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cabeleireiros")
public class CabeleireiroController {

    @Autowired
    private CabeleireiroService cabeleireiroService;

    @PostMapping
    public Cabeleireiro createCabeleireiro(@RequestBody Cabeleireiro cabeleireiro) {
        return cabeleireiroService.saveCabeleireiro(cabeleireiro);
    }

    @GetMapping
    public List<Cabeleireiro> getAllCabeleireiros() {
        return cabeleireiroService.getAllCabeleireiros();
    }

    @GetMapping("/{id}")
    public Cabeleireiro getCabeleireiroById(@PathVariable Long id) {
        return cabeleireiroService.getCabeleireiroById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteCabeleireiro(@PathVariable Long id) {
        cabeleireiroService.deleteCabeleireiro(id);
    }
}

