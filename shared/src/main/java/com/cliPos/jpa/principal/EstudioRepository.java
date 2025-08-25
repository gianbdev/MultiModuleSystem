package com.cliPos.jpa.principal;

import com.cliPos.entity.generals.EstudioEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstudioRepository extends JpaRepository<EstudioEntity, UUID> {

    Page<EstudioEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}