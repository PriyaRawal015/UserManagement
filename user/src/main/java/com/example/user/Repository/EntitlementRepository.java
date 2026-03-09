package com.example.user.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.user.Entity.entitlement;

public interface EntitlementRepository extends JpaRepository<entitlement, UUID> {
}