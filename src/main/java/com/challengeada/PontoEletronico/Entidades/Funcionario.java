package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Funcionario")
@Data
public class Funcionario {

    @Id
    private String IdCodigoFuncional;
    @Column(name = "nome_funcionario")
    private String nome;
    @Column(name = "CPF_funcionario")
    private String CPF;
    @Column(name = "cargo_funcionario")
    private String cargo;
    @OneToMany
    private List<Endereco> enderecoList;
    @ManyToOne
    @JoinColumn (name = "id_empresa")
    private Empresa empresa;


}

