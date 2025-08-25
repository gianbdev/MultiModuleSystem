package com.cliPos.jpa.configuracion;

import com.cliPos.entity.configuracion.SedeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SedeJpaRepository extends JpaRepository<SedeEntity, UUID> {

    //List<SedeEntity> findByHospital_HospitalId(UUID hospitalId);

    Page<SedeEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}