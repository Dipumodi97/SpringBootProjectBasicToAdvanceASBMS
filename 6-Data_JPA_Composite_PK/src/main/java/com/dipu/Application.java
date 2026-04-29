package com.dipu;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dipu.entity.Account;
import com.dipu.entity.AccountPK;
import com.dipu.repository.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
	
		AccountRepository accountRepository = context.getBean(AccountRepository.class);
				
		/**
		AccountPK accountPK =  new AccountPK();
		accountPK.setAccountId(56456);
		accountPK.setAccountNumber(3657348L);
		accountPK.setAccountType("Current");
		
		Account account = new Account();
		account.setBranch("Pathaldiha");
		account.setHolderName("Dipu");
		account.setAccountPK(accountPK);
		
		accountRepository.save(account);
		
		*/
		

		// To Retrieve a record using PK
		AccountPK accountPK =  new AccountPK();
		accountPK.setAccountId(56456);
		accountPK.setAccountNumber(3657348L);
		accountPK.setAccountType("Current");
		
		Optional<Account> findById = accountRepository.findById(accountPK);
		System.out.println(findById.get());		
	}

}
