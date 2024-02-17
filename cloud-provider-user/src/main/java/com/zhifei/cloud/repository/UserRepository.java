package com.zhifei.cloud.repository;

import com.zhifei.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
