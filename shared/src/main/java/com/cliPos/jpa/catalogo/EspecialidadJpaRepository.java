package com.cliPos.jpa.catalogo;

import com.cliPos.entity.catalogo.EspecialidadEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface EspecialidadJpaRepository extends JpaRepository<EspecialidadEntity, UUID> {

    List<EspecialidadEntity> findByHospital_HospitalId(UUID hospitalId);

    Page<EspecialidadEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}