package com.cliPos.jpa.paciente.Evolucion;

import com.cliPos.entity.paciente.historialclinico.evolucion.EvolucionEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EvolucionJpaRepository extends JpaRepository<EvolucionEntity, UUID> {

    Page<EvolucionEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}