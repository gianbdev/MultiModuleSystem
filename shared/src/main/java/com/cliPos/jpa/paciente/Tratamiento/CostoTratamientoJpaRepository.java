package com.cliPos.jpa.paciente.Tratamiento;

import com.cliPos.entity.paciente.historialclinico.tratamiento.CostoTratamientoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CostoTratamientoJpaRepository extends JpaRepository<CostoTratamientoEntity, UUID> {

    Page<CostoTratamientoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}