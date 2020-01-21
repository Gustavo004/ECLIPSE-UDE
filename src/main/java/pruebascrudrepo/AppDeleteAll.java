package pruebascrudrepo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.xml.bind.CycleRecoverable.Context;

import net.itinajero.app.repository.NoticiasRepository;

public class AppDeleteAll {

	public static void main(String[] args) {
		
		

		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("root-context.xml");
		
		NoticiasRepository repo = context.getBean("noticiasRepository",NoticiasRepository.class);
		
		//Borrar todos los registros[metodo deleteAll del repositorio]
		//Alerta ES UN METODO MUY PELIGROSO !!! USARLO CON CUIDADO  CON EMPLEADOS QUE ESTAN POR RENUNCIAR 
		
		
		repo.deleteAll();
		
		
		
		
		context.close();
	}

}
