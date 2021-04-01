package crud.pelicula.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PELICULAS")
public class Peliculas {
	
	@Column(name = "ID")
    @javax.persistence.Id
	private int Id;
	
	@Column(name = "NOMBRE", nullable = true, length = 255)
	private String nombre;
	
	@Column(name = "DIRECTOR", nullable = true, length = 255)
	private String director;
	
	@Column(name = "ANIO_ESTRENO", nullable = true, length = 255)
	private String anio;
	
	public Peliculas() {
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	

}
