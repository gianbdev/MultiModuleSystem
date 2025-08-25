package com.cliPos.jpa.operaciones;

import com.cliPos.entity.operaciones.CategoriaMatEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriaMatJpaRepository extends JpaRepository<CategoriaMatEntity, UUID> {

    Page<CategoriaMatEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}