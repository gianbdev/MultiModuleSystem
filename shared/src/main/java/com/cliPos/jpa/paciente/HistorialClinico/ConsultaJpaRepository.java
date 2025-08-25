package com.cliPos.jpa.paciente.HistorialClinico;

import com.cliPos.entity.paciente.historialclinico.ConsultaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaJpaRepository extends JpaRepository<ConsultaEntity, UUID> {

    Page<ConsultaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}