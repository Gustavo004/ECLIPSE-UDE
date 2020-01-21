package pruebascrudrepo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.itinajero.app.model.Noticia;
import net.itinajero.app.repository.NoticiasRepository;

public class AppFindAll {

	public static void main(String[] args) {
		
		
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("root-context.xml");
		
		NoticiasRepository repo = context.getBean("noticiasRepository",NoticiasRepository.class);
		
		
		//Recuperar todos los registros [Metodo FindAll del repositorio]

		
		Iterable<Noticia> it = repo.findAll(); //--> ESTO ES UNA COLECION SIGNIFICA QUE LO PODEMOS RECORRER
		
		for (Noticia n : it) {
				System.out.println(n);
		}
		
		context.close();
		
	}

}
