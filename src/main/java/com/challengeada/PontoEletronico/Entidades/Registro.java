package com.challengeada.PontoEletronico.Entidades;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "Registro")

public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "descricao_registro")
    private String descricao;
    @Column(name = "justificativa_registro")
    private String justificativa;
    @Column(name = "horario_registro")
    private LocalTime horario;
    @Column(name = "data_registro")
    private LocalDate data;

    @ManyToOne
    @JoinColumn (name = "id_usuario")
    private Usuario usuario;

}
