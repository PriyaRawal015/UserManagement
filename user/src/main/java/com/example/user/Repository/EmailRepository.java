package com.example.user.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.user.Entity.email;

public interface EmailRepository extends JpaRepository<email, UUID> {
}