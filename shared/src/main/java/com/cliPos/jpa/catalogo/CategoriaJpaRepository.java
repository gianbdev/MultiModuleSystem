package com.cliPos.jpa.catalogo;

import com.cliPos.entity.catalogo.CategoriaEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoriaJpaRepository extends JpaRepository<CategoriaEntity, UUID> {

    //List<CategoriaModel> findByHospital_HospitalId(UUID hospitalId);

    Page<CategoriaEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}