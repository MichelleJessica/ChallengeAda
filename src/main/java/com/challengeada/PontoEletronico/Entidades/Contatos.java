package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Contatos")

public class Contatos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "telefone_contatos")
    private String telefone;
    @Column(name = "DDD_contatos")
    private Integer DDD;
    @Column(name = "email_contatos")
    private String email;

    @ManyToOne
    @JoinColumn (name = "id_funcionario")
    private Funcionario funcionario;
}
