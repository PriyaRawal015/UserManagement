package com.example.user.Repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.user.Entity.Resource;

public interface ResourceRepository extends JpaRepository<Resource, UUID> {
}