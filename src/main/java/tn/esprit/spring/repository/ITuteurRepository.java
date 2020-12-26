package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.entities.Tuteur;

@Repository
public interface ITuteurRepository extends CrudRepository<Tuteur, Integer> {
}
