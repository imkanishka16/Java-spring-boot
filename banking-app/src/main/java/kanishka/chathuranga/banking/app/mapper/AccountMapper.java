package kanishka.chathuranga.banking.app.mapper;

import kanishka.chathuranga.banking.app.dto.AccountDto;
import kanishka.chathuranga.banking.app.entity.Account;
import kanishka.chathuranga.banking.app.repository.AccountRepository;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
