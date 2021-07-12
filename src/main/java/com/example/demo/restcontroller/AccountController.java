package com.example.demo.restcontroller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.example.demo.DTO.AccountDTO;
import com.example.demo.entity.Account;
import com.example.demo.exception.AccountException;
import com.example.demo.service.AccountService;
import com.example.demo.service.Impl.AccountServiceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
class AccountController {
  @Autowired
  private AccountService accountService;

  @Autowired
  private ModelMapper modelMapper;


  @GetMapping("/accounts")
  List<AccountDTO> all() {
    List<Account> accounts = accountService.retrieveAccounts();
    return accounts.stream().map(this::convertToDto).collect(Collectors.toList());
  }
  private AccountDTO convertToDto(Account account){
    AccountDTO accountDTO = modelMapper.map(account, AccountDTO.class);
    accountDTO.setFirstname(account.getAccountDetails().getfirstname());
    accountDTO.setLastname(account.getAccountDetails().getlastname());
    accountDTO.setAge(account.getAccountDetails().getage());
    accountDTO.setEmail(account.getAccountDetails().getemail());
    accountDTO.setAddress(account.getAccountDetails().getaddress());
    accountDTO.setPhonenum(account.getAccountDetails().getphonenum());
    accountDTO.setAvatar(account.getAccountDetails().getAvatar());
    return accountDTO;
  }
  //convert to 2 entity
  private Account convertToEntity(AccountDTO accountDTO) throws ParseException {
    Account account = modelMapper.map(accountDTO, Account.class);
    account.setfirstname(accountDTO.getFirstname());
    account.s
 
    // if (accountDTO.getId() != null) {
    //     Account oldAccount = postService.getAccountById(accountDTO.getId());
    //     post.setRedditID(oldAccount.getRedditID());
    //     post.setSent(oldAccount.isSent());
    // }
    // return post;
}

  @PostMapping("/accounts")
  @ResponseStatus(HttpStatus.CREATED)
  @ResponseBody
  Account newAccount(@RequestBody AccountDTO newAccountDTo) {
    Account account = convert
  }

  
  @GetMapping("/accounts/{id}")
  Account one(@PathVariable Long id) {
    
    return accountService.findById(id)
      .orElseThrow(() -> new AccountException(id));
  }

  @PutMapping("/accounts/{id}")
  Account replaceAccount(@RequestBody Account newAccount, @PathVariable Long id) {
    
    return accountService.findById(id)
      .map(account -> {
        account.setName(newAccount.getName());
        account.setpassword(newAccount.getpassword());
        return accountService.save(account);
      })
      .orElseGet(() -> {
        newAccount.setId(id);
        return accountService.save(newAccount);
      });
  }

  @DeleteMapping("/accounts/{id}")
  void deleteAccount(@PathVariable Long id) {
    accountService.deleteById(id);
  }
}