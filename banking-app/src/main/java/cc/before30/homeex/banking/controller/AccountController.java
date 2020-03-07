package cc.before30.homeex.banking.controller;

import cc.before30.homeex.banking.domain.Account;
import cc.before30.homeex.banking.domain.AccountService;
import cc.before30.homeex.banking.dto.request.AccountStatementRequest;
import cc.before30.homeex.banking.dto.request.TransferBalanceRequest;
import cc.before30.homeex.banking.dto.response.Response;
import lombok.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AccountController
 *
 * @author before30
 * @since 2020/03/07
 */
@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(@NonNull AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    public List<Account> create(@RequestBody Account account) {
        accountService.save(account);
        return accountService.findAll();
    }

    @GetMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }

    @PostMapping("/sendmoney")
    public Response sendMoney(
            @RequestBody TransferBalanceRequest transferBalanceRequest
    ) {

        return Response.ok().setPayload(
                accountService.sendMoney(
                        transferBalanceRequest
                )
        );
    }
    @PostMapping("/statement")
    public Response getStatement(
            @RequestBody AccountStatementRequest accountStatementRequest

    ){
        return Response.ok().setPayload(
                accountService.getStatement(accountStatementRequest.getAccountNumber())
        );
    }

}
