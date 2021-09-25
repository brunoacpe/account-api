package br.com.letscode.accountapi.Response;

import br.com.letscode.accountapi.Request.AccountRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class AccountResponse {

    private String cpf;

    private String name;

    private String cep;

    private String email;

    @JsonProperty(value = "telephone_number")
    private String telephoneNumber;


    public static AccountResponse of (AccountRequest accountRequest){
        AccountResponse accountResponse = new AccountResponse();
        BeanUtils.copyProperties(accountRequest,accountResponse);
        return accountResponse;
    }
}
