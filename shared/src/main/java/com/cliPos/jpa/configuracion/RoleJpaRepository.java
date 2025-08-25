package com.cliPos.jpa.configuracion;

import com.cliPos.entity.configuracion.RoleEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleJpaRepository extends JpaRepository<RoleEntity, UUID> {

    List<RoleEntity> findByHospital_HospitalId(UUID hospitalId);

    Optional<RoleEntity> findByRoleId(UUID roleId);

    Page<RoleEntity> findByHospital_HospitalId(UUID hospitalId, Pageable pageable);

}