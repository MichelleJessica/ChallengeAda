package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Empresa")

public class Empresa {
    @Id
    private String cnpj;
    @Column(name = "nome_empresa")
    private String nome;
    @OneToMany
    private List<Endereco> enderecoList;
    @OneToMany
    private List<Funcionario> funcionarioList;

}
