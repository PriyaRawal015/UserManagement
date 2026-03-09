package com.example.user.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.user.Entity.name;

public interface NameRepository extends JpaRepository<name, UUID> {
}