package com.cliPos.jpa.catalogo;

import com.cliPos.entity.catalogo.PlanEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlanJpaRepository extends JpaRepository<PlanEntity, UUID> {

    Page<PlanEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}