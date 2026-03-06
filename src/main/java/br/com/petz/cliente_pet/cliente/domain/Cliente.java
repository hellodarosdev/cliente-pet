package br.com.petz.cliente_pet.cliente.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idCliente;
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String celular;
    private String telefone;
    private Sexo sexo;
    @NotNull
    private LocalDate dataNacimento;
    @CPF
    private String cpf;
    @NotNull
    private Boolean aceitaTermos;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;

    public Cliente(LocalDateTime dataHoraDaUltimaAlteracao, Boolean aceitaTermos, String celular, String cpf,
                   LocalDateTime dataHoraDoCadastro, LocalDate dataNacimento, String email, String nomeCompleto,
                   Sexo sexo, String telefone) {

        this.aceitaTermos = aceitaTermos;
        this.celular = celular;
        this.cpf = cpf;
        this.dataHoraDoCadastro = LocalDateTime.now();
        this.dataNacimento = dataNacimento;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.telefone = telefone;
    }
}
