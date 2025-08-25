package com.cliPos.jpa.catalogo;

import com.cliPos.entity.catalogo.AlergiaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlergiaJpaRepository extends JpaRepository<AlergiaEntity, UUID> {

    Page<AlergiaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}