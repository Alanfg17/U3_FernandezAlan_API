package edu.utez.p1.repository;

import org.springframework.stereotype.Repository;

import edu.utez.p1.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
	
	public Persona findByCURP(String CURP);


}
