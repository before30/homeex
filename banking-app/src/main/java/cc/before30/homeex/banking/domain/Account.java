package cc.before30.homeex.banking.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Account
 *
 * @author before30
 * @since 2020/03/07
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(
        name = "accounts",
        indexes = {@Index(name = "idx_account_number", columnList = "account_number", unique = true)}
)
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "current_balance")
    private BigDecimal currentBalance;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JoinTable(
            name = "account_transaction_mapper",
            joinColumns = @JoinColumn(name = "account_number"),
            inverseJoinColumns = @JoinColumn(name = "transaction_id")
    )
    private List<Transaction> transactions = new ArrayList<>();

}
