package com.example.user.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.user.Entity.meta;

public interface MetaRepository extends JpaRepository<meta, UUID> {
}