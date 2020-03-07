package cc.before30.homeex.banking.dto.model;

import cc.before30.homeex.banking.domain.Transaction;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * AccountStatement
 *
 * @author before30
 * @since 2020/03/07
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountStatement {
    BigDecimal currentBalance;
    List<Transaction> transactionHistory;
}
