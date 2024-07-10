package kanishka.chathuranga.banking.app.repository;

import kanishka.chathuranga.banking.app.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long>  {
}
