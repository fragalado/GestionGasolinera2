package aplicacion.servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz menu donde haremos los métodos
 * @author frand
 *
 */
public class ImplMenu implements InterfazMenu {
	
	// Menu
	@Override
	public int Menu() {
		// Opciones
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje factura");
		System.out.println("3. Ver todos los repostajes");
		System.out.println("0. Salir");
		// Pedimos la opcion y la guardamos
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca una opción: ");
		return sc.nextInt();
	}

}
