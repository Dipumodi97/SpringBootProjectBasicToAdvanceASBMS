package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.entity.Account;
import com.dipu.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
