package br.com.letscode.accountapi.Request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccountRequest {

    private String cpf;

    private String name;

    private String cep;

    private String email;

    @JsonProperty(value = "telephone_number")
    private String telephoneNumber;
}
