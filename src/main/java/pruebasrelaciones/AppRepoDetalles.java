package pruebasrelaciones;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.itinajero.app.model.Detalle;
import net.itinajero.app.repository.DetallesRepository;

public class AppRepoDetalles {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		
		
		DetallesRepository report = context.getBean("detallesRepository",DetallesRepository.class);
		
		
		List <Detalle> lista = report.findAll();
		
		
		for (Detalle d : lista) {
			System.out.println(d);
		}
		
		context.close();
	}

}
