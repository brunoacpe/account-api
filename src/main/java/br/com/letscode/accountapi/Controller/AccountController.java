package br.com.letscode.accountapi.Controller;

import br.com.letscode.accountapi.Request.AccountRequest;
import br.com.letscode.accountapi.Response.AccountResponse;
import br.com.letscode.accountapi.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService services;


    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<AccountResponse> createAccount(@RequestBody AccountRequest account){
        return ResponseEntity.status(HttpStatus.CREATED).body(services.createAccount(account));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAccount(@PathVariable String cpf){
        return ResponseEntity.status(HttpStatus.OK).body(services.deleteAccount(cpf));
    }
    
}
