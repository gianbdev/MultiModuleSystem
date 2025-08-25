package com.cliPos.jpa.paciente.HistorialClinico;

import com.cliPos.entity.paciente.historialclinico.ExploracionFisicaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ExploracionFisicaJpaRepository extends JpaRepository<ExploracionFisicaEntity, UUID> {

    Page<ExploracionFisicaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}