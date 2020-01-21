package net.itinajero.app.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.itinajero.app.model.Noticia;


@Repository //crea un bean que esta relacionado con base de datos esta diseñado para la implementacion a base de un modelo

//public interface NoticiasRepository extends CrudRepository<Noticia, Integer>
public interface NoticiasRepository extends JpaRepository<Noticia, Integer> {

	
	//Select*from Noticia
	List<Noticia> findBy();
	
	
	//Select*from Noticias where estatus=?
	List<Noticia> findByEstatus(String estatus) ;
	
	
	
	//Select*from Noticias where fecha=?
	List<Noticia> findByFecha(Date fecha) ;
	
	
	//where estatus=? and fecha=?
	
	List<Noticia>findByEstatusAndFecha(String estatus,Date fecha);
	
	
	//where estatus=? or fecha=?
	
   List<Noticia>findByEstatusOrFecha(String estatus,Date fecha);
   
   
   //Where fecha between ? and ?
   
   List<Noticia>findByFechaBetween(Date fecha1,Date fecha2);	
   
   
  //Where id between ? and ?
   
   List<Noticia>findByIdBetween(int n1,int n2);	
	
	
	
}
