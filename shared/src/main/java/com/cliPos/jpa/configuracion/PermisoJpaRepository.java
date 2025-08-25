package com.cliPos.jpa.configuracion;

import com.cliPos.entity.configuracion.PermisoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PermisoJpaRepository extends JpaRepository<PermisoEntity, UUID> {

    List<PermisoEntity> findByHospitalHospitalId(UUID hospitalId);

    Page<PermisoEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}