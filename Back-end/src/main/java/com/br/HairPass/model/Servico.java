package com.br.HairPass.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double preco;

    private Boolean complexo;

    @ManyToOne
    @JoinColumn(name = "cabeleireiro_id")
    private Cabeleireiro cabeleireiro;

    @ManyToOne
    @JoinColumn(name = "plano_assinatura_id")
    private PlanoAssinatura planoAssinatura;
}



