package br.com.petz.cliente_pet.cliente.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.Empty;
import org.hibernate.validator.constraints.br.CPF;
import java.util.UUID;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity

public class Cliente {
    @Id
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


        this.idCliente = UUID.randomUUID();
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
