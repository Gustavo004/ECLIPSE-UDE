package net.itinajero.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.Noticia;


@Repository //crea un bean que esta relacionado con base de datos esta diseñado para la implementacion a base de un modelo
public interface NoticiasRepository extends CrudRepository<Noticia, Integer> {

	
	
	
	
}
