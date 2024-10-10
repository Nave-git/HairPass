package com.br.HairPass.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Localizacao {

    private String endereco;

    private Double latitude;

    private Double longitude;
}

