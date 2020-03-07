package cc.before30.homeex.banking.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * AccountRespositoryh
 *
 * @author before30
 * @since 2020/03/07
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountNumberEquals(String accountNumber);

}
