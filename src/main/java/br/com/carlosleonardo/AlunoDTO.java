package br.com.carlosleonardo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@Table(name = "alunos")
public class AlunoDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telefone;

    @Column
    private String endereco;

    @Column
    private double notaFinal;

    @Column
    private String status;

    @Column
    private Date dataNascimento;

    @Column(nullable = false)
    private Date dataMatricula;

    @Column
    private Date dataConclusao;

    @Column
    private String observacoes;

}
