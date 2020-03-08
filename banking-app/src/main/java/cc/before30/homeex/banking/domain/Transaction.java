package cc.before30.homeex.banking.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Transaction
 *
 * @author before30
 * @since 2020/03/07
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "transactions")
@Builder
public class Transaction {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long transactionId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "amount")
    private BigDecimal transactionAmount;

    @Column(name = "datetime")
    private LocalDateTime transactionDateTime;

}
