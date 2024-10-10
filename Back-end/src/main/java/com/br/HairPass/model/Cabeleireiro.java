package com.br.HairPass.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cabeleireiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String especialidade;

    @OneToMany(mappedBy = "cabeleireiro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Servico> servicos;
}

