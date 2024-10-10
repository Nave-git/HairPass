package com.br.HairPass.controller;

import com.br.HairPass.model.Agendamento;
import com.br.HairPass.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @PostMapping
    public Agendamento createAgendamento(@RequestBody Agendamento agendamento) {
        return agendamentoService.saveAgendamento(agendamento);
    }

    @GetMapping
    public List<Agendamento> getAllAgendamentos() {
        return agendamentoService.getAllAgendamentos();
    }

    @GetMapping("/{id}")
    public Agendamento getAgendamentoById(@PathVariable Long id) {
        return agendamentoService.getAgendamentoById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteAgendamento(@PathVariable Long id) {
        agendamentoService.deleteAgendamento(id);
    }
}
