package com.cliPos.jpa.movimiento;

import com.cliPos.entity.movimiento.AlmacenEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlmacenJpaRepository extends JpaRepository<AlmacenEntity, UUID> {

    Page<AlmacenEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}