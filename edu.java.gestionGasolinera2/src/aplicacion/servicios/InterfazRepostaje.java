package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Repostaje;

/**
 * Interfaz que define a los métodos que darán servicio a la clase repostaje
 * @author frand
 *
 */
public interface InterfazRepostaje {
	
	// Repostaje normal
	/**
	 * Método que crea un objeto repostaje (normal) con los atributos id, fecha, litros e importe
	 * @param listaBD
	 * @return
	 */
	public Repostaje repostajeNormal(List<Repostaje> listaBD);
	
	// Repostaje factura
	/**
	 * Método que crea un objeto repostaje (factura) con todos los atributos
	 * @param listaBD
	 * @return
	 */
	public Repostaje repostajeFactura(List<Repostaje> listaBD);
	
	// Ver todos los repostajes
	/**
	 * Método que devuelve todos los repostajes por consola
	 * @param listaBD
	 */
	public void verTodosRepostajes(List<Repostaje> listaBD);
}
