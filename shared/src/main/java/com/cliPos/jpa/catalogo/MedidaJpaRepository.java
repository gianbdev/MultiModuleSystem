package com.cliPos.jpa.catalogo;

import com.cliPos.entity.catalogo.MedidaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface MedidaJpaRepository extends JpaRepository<MedidaEntity, UUID> {

    List<MedidaEntity> findByHospital_HospitalId(UUID hospitalId);

    Page<MedidaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}