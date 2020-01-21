package pruebasJPA;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.itinajero.app.model.Noticia;
import net.itinajero.app.repository.NoticiasRepository;

public class AppCreate {

	public static void main(String[] args) {
			
		Noticia noticia = new Noticia();
		
		noticia.setTitulo("Proximo Estreno de Avengers");
		noticia.setDetalle("el mes proxima sale disfrutelo en la mejores salas che ");
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("root-context.xml");
		
		NoticiasRepository repo = context.getBean("noticiasRepository",NoticiasRepository.class);
		
		repo.save(noticia);
		
		context.close();
		


	}

}
