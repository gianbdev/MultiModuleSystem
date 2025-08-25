package com.cliPos.jpa.operaciones;

import com.cliPos.entity.operaciones.MarcaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MarcaJpaRepository extends JpaRepository<MarcaEntity, UUID> {

    Page<MarcaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}