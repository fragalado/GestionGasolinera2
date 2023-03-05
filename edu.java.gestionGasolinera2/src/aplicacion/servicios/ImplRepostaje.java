package aplicacion.servicios;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Repostaje;

/**
 * Implementación de la interfaz repostaje donde haremos los métodos
 * @author frand
 *
 */
public class ImplRepostaje implements InterfazRepostaje {

	// Repostaje Normal
	@Override
	public Repostaje repostajeNormal(List<Repostaje> listaBD) {
		// Atributos: ID, Fecha, Litros, Importe
		// Creamos un objeto de tipo Repostaje
		Repostaje repost = new Repostaje();
		
		// Scanner para leer los datos
		Scanner sc = new Scanner(System.in);
		
		// Pedimos la fecha
		System.out.println("Introduzca la fecha del repostaje:");
		LocalDate fechaRepostaje = LocalDate.parse(sc.next());
		
		// Pedimos el importe del repostaje
		System.out.println("Introduzca el importe del repstaje:");
		float importe = sc.nextFloat();
		
		// Calculamos los litros a partir del importe
		float litros = importe / 1.5f;
				
		// Le añadimos todos los valores al objeto y devolvemos
		repost.setId(asignaID(listaBD));
		repost.setFechaRepostaje(fechaRepostaje);
		repost.setLitros(Math.round(litros * 100.0) / 100.0f);
		repost.setImporte(importe);
		
		return repost;
	}
	
	// Repostaje Factura
	@Override
	public Repostaje repostajeFactura(List<Repostaje> listaBD) {
		// Atributos: ID, Fecha, Litros, Importe, DNI, Matricula
		// Creamos un objeto de tipo Repostaje
		Repostaje repost = new Repostaje();
		
		// Scanner para leer los datos
		Scanner sc2 = new Scanner(System.in);
		
		// Pedimos la fecha
		System.out.println("Introduzca la fecha del repostaje:");
		LocalDate fechaRepostaje = LocalDate.parse(sc2.next());
		
		// Pedimos el importe del repostaje
		System.out.println("Introduzca el importe del repstaje:");
		float importe = sc2.nextFloat();
		
		// Calculamos los litros a partir del importe
		float litros = importe / 1.5f;
		
		// Pedimos el dni del cliente
		System.out.println("Introduzca su DNI:");
		String dniCliente = sc2.next();
		
		// Pedimos la matricula del coche del cliente
		System.out.println("Introduzca su matrícula:");
		String matriculaCliente = sc2.next();
				
		// Le añadimos todos los valores al objeto y devolvemos
		repost.setId(asignaID(listaBD));
		repost.setFechaRepostaje(fechaRepostaje);
		repost.setLitros(Math.round(litros * 100.0) / 100.0f);
		repost.setImporte(importe);
		repost.setDniCliente(dniCliente);
		repost.setMatriculaVehiculo(matriculaCliente);
		
		return repost;
	}
	
	// Ver todos los repostajes
	@Override
	public void verTodosRepostajes(List<Repostaje> listaBD) {
		// Declaramos una variable auxiliar de tipo Respotaje
		Repostaje aux;
		for (int i = 0; i < listaBD.size(); i++) {
			// Guardamos el objeto en aux
			aux = listaBD.get(i);
			
			// Mostramos los datos de aux
			System.out.println("ID: " + aux.getId() + "; Fecha Respotaje: " + aux.getFechaRepostaje() + 
					"; Litros: " + aux.getLitros() + "; Importe: " + aux.getImporte() + "; DNI: "+ aux.getDniCliente() + "; Matricula: " + aux.getMatriculaVehiculo());
		}
		
	}
	
	// Método que asigna el id
	/**
	 * Método que devuelve el último id añadido + 1
	 * @param listaBD
	 * @return
	 */
	private int asignaID(List<Repostaje> listaBD) {
		// Declaramos la variable donde guardaremos el id maximo
		int idMaximo = 0;
		
		// Bucle para recorrer la lista
		for (Repostaje aux : listaBD) {
			// if para comprobar el id
			if(aux.getId() > idMaximo)
				idMaximo = aux.getId();
		}
		
		// Devolvemos el idMaximo + 1
		return idMaximo + 1;
		
	}

}
