package com.cliPos.jpa.paciente.HistorialClinico;

import com.cliPos.entity.paciente.historialclinico.PacienteAlergiaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PacienteAlergiaJpaRepository extends JpaRepository<PacienteAlergiaEntity, UUID> {

    Page<PacienteAlergiaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}