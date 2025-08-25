package com.cliPos.jpa.catalogo;

import com.cliPos.entity.catalogo.TipoConceptoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoConceptoJpaRepository extends JpaRepository<TipoConceptoEntity, UUID> {

    Page<TipoConceptoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}