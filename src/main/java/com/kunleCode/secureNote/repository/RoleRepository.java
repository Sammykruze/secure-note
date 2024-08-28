package com.kunleCode.secureNote.repository;

import com.kunleCode.secureNote.model.AppRole;
import com.kunleCode.secureNote.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
