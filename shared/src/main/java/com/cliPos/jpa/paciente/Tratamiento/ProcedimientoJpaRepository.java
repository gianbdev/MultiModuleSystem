package com.cliPos.jpa.paciente.Tratamiento;

import com.cliPos.entity.paciente.historialclinico.tratamiento.ProcedimientoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProcedimientoJpaRepository extends JpaRepository<ProcedimientoEntity, UUID> {

    Page<ProcedimientoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}