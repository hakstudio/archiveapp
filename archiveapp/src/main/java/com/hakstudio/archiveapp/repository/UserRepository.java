package com.hakstudio.archiveapp.repository;

import com.hakstudio.archiveapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
