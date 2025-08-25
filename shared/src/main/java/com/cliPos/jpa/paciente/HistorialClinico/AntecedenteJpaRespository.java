package com.cliPos.jpa.paciente.HistorialClinico;

import com.cliPos.entity.paciente.historialclinico.AntecedentesEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AntecedenteJpaRespository extends JpaRepository<AntecedentesEntity, UUID> {

    Page<AntecedentesEntity> findByHospital_HospitalId(UUID hopitalId, Pageable pageable);

}