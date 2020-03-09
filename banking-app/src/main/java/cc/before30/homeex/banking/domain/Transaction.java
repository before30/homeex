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
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "account_number")
    private String accountNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "account_number",
            referencedColumnName = "account_number",
            insertable = false,
            updatable = false
    )
    private Account account;

    @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "transaction_datetime",
            columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime transactionDateTime;

}
