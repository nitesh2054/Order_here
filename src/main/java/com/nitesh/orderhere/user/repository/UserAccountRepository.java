package com.nitesh.orderhere.user.repository;

import com.nitesh.orderhere.user.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {
      UserAccount findByUserName(String username);
}
