package com.cliPos.jpa.mantenimiento;

import com.cliPos.entity.mantenimiento.CajaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CajaJpaRepository extends JpaRepository<CajaEntity, UUID> {

    Page<CajaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}