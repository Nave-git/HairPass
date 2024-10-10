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
public class PlanoAssinatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome; // Bronze, Prata, Ouro, Diamante

    private Double precoMensal;

    @OneToMany(mappedBy = "planoAssinatura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Cliente> clientes;

    @OneToMany(mappedBy = "planoAssinatura", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Servico> servicos;
}
