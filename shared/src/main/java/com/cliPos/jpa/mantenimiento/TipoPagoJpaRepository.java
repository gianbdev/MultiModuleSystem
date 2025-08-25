package com.cliPos.jpa.mantenimiento;

import com.cliPos.entity.mantenimiento.TipoPagoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TipoPagoJpaRepository extends JpaRepository<TipoPagoEntity, UUID> {

    Page<TipoPagoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}