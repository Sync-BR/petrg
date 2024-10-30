package com.meuspets.petlove.repository;

import com.meuspets.petlove.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PetsRepository extends JpaRepository<PetModel, Long> {
   PetModel findByNamePet(String name);
   @Query("SELECT p FROM PetModel p WHERE p.id_usuario = :usuarioId")
   List<PetModel> findAllByUsuarioId(@Param("usuarioId") int usuarioId);


}
