package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;

import aplicacion.entidades.Repostaje;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.ImplRepostaje;
import aplicacion.servicios.InterfazMenu;
import aplicacion.servicios.InterfazRepostaje;

/**
 * Clase principal donde llamaremos a las demas clases y que contendrá el main
 * @author frand
 *
 */
public class Menu {

	public static void main(String[] args) {
		
		// Inicializamos las interfaces e implementaciones
		InterfazMenu intMenu = new ImplMenu();
		InterfazRepostaje intRepost = new ImplRepostaje();
		
		// Creamos una lista para guardar los repostajes (base de datos)
		List<Repostaje> listaBD = new ArrayList<>();
		
		int opcion;
		do {
			// Mostramos el menu y guardamos en una variable la opción elegida
			opcion = intMenu.Menu();
			
			switch (opcion) {
			case 1:
				// Repostaje Normal
				listaBD.add(intRepost.repostajeNormal(listaBD));
				break;

			case 2:
				// Repostaje Factura
				listaBD.add(intRepost.repostajeFactura(listaBD));
				break;
			
			case 3:
				// Ver todos los repostajes
				intRepost.verTodosRepostajes(listaBD);
				break;
			}
		} while (opcion != 0);

	}

}
