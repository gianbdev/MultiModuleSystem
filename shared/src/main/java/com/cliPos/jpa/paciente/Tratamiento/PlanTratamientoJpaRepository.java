package com.cliPos.jpa.paciente.Tratamiento;

import com.cliPos.entity.paciente.historialclinico.tratamiento.PlanTratamientoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PlanTratamientoJpaRepository extends JpaRepository<PlanTratamientoEntity, UUID> {

    Page<PlanTratamientoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}