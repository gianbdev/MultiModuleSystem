package com.cliPos.jpa.operaciones;

import com.cliPos.entity.operaciones.ProveedorEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProveedorJpaRepository extends JpaRepository<ProveedorEntity, UUID> {

    Page<ProveedorEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}