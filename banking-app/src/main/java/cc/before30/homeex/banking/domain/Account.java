package cc.before30.homeex.banking.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

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
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long accountId;

    @Column(name = "number")
    private String accountNumber;

    @Column(name = "current_balance")
    private BigDecimal currentBalance;

}
