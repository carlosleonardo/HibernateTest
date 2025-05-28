package br.com.carlosleonardo;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "alunos")
public record AlunoDTO(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id,
        @Column(nullable = false) String nome,
        @Column(nullable = false) String email,
        @Column(nullable = false) String telefone,
        @Column String endereco,
        @Column double notaFinal,
        @Column String status,
        @Column Date dataNascimento,
        @Column(nullable = false) Date dataMatricula,
        @Column Date dataConclusao,
        @Column String observacoes
) {
    public AlunoDTO() {
        this(0, "", "", "", "", 0.0, "", new Date(), new Date(), null, "");
    }
}
