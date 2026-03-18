package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Cliente;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import lombok.Value;
import java.time.LocalDateTime;
import java.util.UUID;

@Value
public class ClienteDetalhadoResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;
    private String telefone;
    private Sexo sexo;
    private Boolean aceitaTermos;
    private LocalDateTime dataHoraDoCadastro;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.aceitaTermos = cliente.getAceitaTermos();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
        this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
        this.email = cliente.getEmail();
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = cliente.getNomeCompleto();
        this.sexo = cliente.getSexo();
        this.telefone =  cliente.getTelefone();
    }

}

