package aplicacion.entidades;

import java.time.LocalDate;

/**
 * Clase Repostaje
 * @author frand
 *
 */
public class Repostaje {
	
	// Atributos
	
	private int id; // ID del repostaje
	private LocalDate fechaRepostaje;
	private float litros;
	private float importe;
	private String dniCliente;
	private String matriculaVehiculo;
	
	// Constructores -> Constructor vacío.
	
	// Getter y Setter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getFechaRepostaje() {
		return fechaRepostaje;
	}
	public void setFechaRepostaje(LocalDate fechaRepostaje) {
		this.fechaRepostaje = fechaRepostaje;
	}
	public float getLitros() {
		return litros;
	}
	public void setLitros(float litros) {
		this.litros = litros;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getMatriculaVehiculo() {
		return matriculaVehiculo;
	}
	public void setMatriculaVehiculo(String matriculaVehiculo) {
		this.matriculaVehiculo = matriculaVehiculo;
	}
	
	// toString
	
	@Override
	public String toString() {
		return "Repostaje [id=" + id + ", fechaRepostaje=" + fechaRepostaje + ", litros=" + litros + ", importe="
				+ importe + ", dniCliente=" + dniCliente + ", matriculaVehiculo=" + matriculaVehiculo + "]";
	}
}
