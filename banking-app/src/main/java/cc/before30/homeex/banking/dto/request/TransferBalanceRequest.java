package cc.before30.homeex.banking.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * TransferBalanceRequest
 *
 * @author before30
 * @since 2020/03/07
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TransferBalanceRequest {
    private String fromAccountNumber;

    private String toAccountNumber;

    private BigDecimal amount;

}
