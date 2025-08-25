package com.cliPos.jpa.paciente;

import com.cliPos.entity.paciente.DiagnosticoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DiagnosticoJpaRepository extends JpaRepository<DiagnosticoEntity, UUID> {

    Page<DiagnosticoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}