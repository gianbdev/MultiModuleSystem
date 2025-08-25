package com.cliPos.jpa.principal;

import com.cliPos.entity.generals.PaisEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaisRepository extends JpaRepository<PaisEntity, Integer> {

    Page<PaisEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}