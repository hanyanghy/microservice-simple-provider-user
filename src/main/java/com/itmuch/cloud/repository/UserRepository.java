package com.itmuch.cloud.repository;

import com.itmuch.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long>{
}
