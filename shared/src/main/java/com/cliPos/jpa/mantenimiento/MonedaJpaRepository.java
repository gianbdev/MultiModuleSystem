package com.cliPos.jpa.mantenimiento;

import com.cliPos.entity.mantenimiento.MonedaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MonedaJpaRepository extends JpaRepository<MonedaEntity, UUID> {

    Page<MonedaEntity> findByHospital_HospitalId(UUID monedaId, Pageable pageable);

}