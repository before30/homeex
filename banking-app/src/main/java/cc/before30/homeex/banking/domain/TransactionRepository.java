package cc.before30.homeex.banking.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TransactionRepository
 *
 * @author before30
 * @since 2020/03/07
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountNumberEquals(String accountNumber);

}
