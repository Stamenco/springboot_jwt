package com.jwt.jwt_demo.authapp.repository;

import com.jwt.jwt_demo.authapp.model.Role;
import com.jwt.jwt_demo.authapp.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
