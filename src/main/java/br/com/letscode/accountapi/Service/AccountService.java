package br.com.letscode.accountapi.Service;

import br.com.letscode.accountapi.Entity.Account;
import br.com.letscode.accountapi.Repository.AccountRepository;
import br.com.letscode.accountapi.Request.AccountRequest;
import br.com.letscode.accountapi.Response.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;
    public AccountResponse createAccount(AccountRequest account) {
        Account account1 = new Account();
        account1.setActive(true);
        account1.setBalance(new BigDecimal("0.0"));
        account1.setCep(account.getCep());
        account1.setEmail(account.getEmail());
        account1.setName(account.getName());
        account1.setTelephoneNumber(account.getTelephoneNumber());
        account1.setCpf(account.getCpf());
        repository.save(account1);
        return AccountResponse.of(account);
    }

    public String deleteAccount(String cpf) {
        Account account = repository.findByCpf(cpf);
        account.setActive(false);
        repository.save(account);
        return "Conta com cpf "+cpf+" desabilitada";
    }
}
