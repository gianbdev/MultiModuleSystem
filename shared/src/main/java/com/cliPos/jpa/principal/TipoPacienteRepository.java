package com.cliPos.jpa.principal;

import com.cliPos.entity.generals.TipoPacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPacienteRepository extends JpaRepository<TipoPacienteEntity, Long> {
    // some methods soon...
}