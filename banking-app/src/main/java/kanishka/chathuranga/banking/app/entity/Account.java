package kanishka.chathuranga.banking.app.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "accounts")
@Entity
public class Account {

    @Id //define id as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment id
    private Long id;

    @Column(name = "account_holder_name")
    private String accountHolderName;
    private double balance;
}
