package com.challengeada.PontoEletronico.Entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Usuario")

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "login_usuario")
    private String login;
    @Column(name = "senha_usuario")
    private String senha;

    @ManyToOne
    @JoinColumn (name = "id_funcionario")
    private Funcionario funcionario;

}
