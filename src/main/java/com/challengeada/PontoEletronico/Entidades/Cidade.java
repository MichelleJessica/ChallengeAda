package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Cidade")

public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_cidade")
    private String nomeDaCidade;
    @Column(name = "UF_cidade")
    private String UF;

    @ManyToOne
    @JoinColumn (name = "id_endereco")
    private Endereco endereco;
}
