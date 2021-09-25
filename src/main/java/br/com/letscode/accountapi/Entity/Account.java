package br.com.letscode.accountapi.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "name")
    private String name;

    @Column(name="cep")
    private String cep;

    @Column(name="balance")
    private BigDecimal balance;

    @Column(name="email")
    private String email;

    @Column(name="is_active")
    @JsonProperty(value="i s_active")
    private boolean isActive;

    @Column(name="telephone_number")
    @JsonProperty(value = "telephone_number")
    private String telephoneNumber;


}
