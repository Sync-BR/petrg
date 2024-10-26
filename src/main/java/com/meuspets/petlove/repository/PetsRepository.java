package com.meuspets.petlove.repository;

import com.meuspets.petlove.model.PetModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetsRepository extends JpaRepository<PetModel, Integer> {
}
