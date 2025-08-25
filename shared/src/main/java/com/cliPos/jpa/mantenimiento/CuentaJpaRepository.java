package com.cliPos.jpa.mantenimiento;

import com.cliPos.entity.mantenimiento.CuentaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CuentaJpaRepository extends JpaRepository<CuentaEntity, UUID> {

    Page<CuentaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}