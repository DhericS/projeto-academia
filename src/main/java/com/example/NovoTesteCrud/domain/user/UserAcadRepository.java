package com.example.NovoTesteCrud.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAcadRepository extends JpaRepository<UserAcad, Long> {
}
