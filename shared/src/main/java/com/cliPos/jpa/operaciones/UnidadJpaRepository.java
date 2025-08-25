package com.cliPos.jpa.operaciones;

import com.cliPos.entity.operaciones.UnidadEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UnidadJpaRepository extends JpaRepository<UnidadEntity, UUID> {

    Page<UnidadEntity> findByHospital_HospitalId(UUID hospiralId, Pageable pageable);

}