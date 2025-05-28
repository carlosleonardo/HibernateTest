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

    @Column(nullable = false, length = 50)
    private String nome;

    @Column(nullable = false, length = 100)
    private String email;

    @Column(nullable = false, length = 30)
    private String telefone;

    @Column(length = 250)
    private String endereco;

    @Column
    private double notaFinal;

    @Column(length = 2)
    private String status;

    @Column
    private Date dataNascimento;

    @Column(nullable = false)
    private Date dataMatricula;

    @Column
    private Date dataConclusao;

    @Column(length = 500)
    private String observacoes;

}
