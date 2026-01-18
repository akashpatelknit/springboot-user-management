package com.akashpatel.usermanagement.repository;

import com.akashpatel.usermanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
