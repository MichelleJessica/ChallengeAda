package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Endereco")

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "logradouro_endereco")
    private String logradouro;
    private Long numero;
    private String CEP;
    @ManyToOne
    @JoinColumn (name = "id_funcionario")
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn (name = "id_empresa")
    private Empresa empresa;
    @OneToMany
    private List<Cidade> cidadeList;
}
