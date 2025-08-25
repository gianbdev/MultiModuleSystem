package com.cliPos.jpa.mantenimiento;

import com.cliPos.entity.mantenimiento.TipoGastoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoGastoJpaRepository extends JpaRepository<TipoGastoEntity, UUID> {

    Page<TipoGastoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}