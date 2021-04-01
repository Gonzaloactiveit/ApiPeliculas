package crud.pelicula.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crud.pelicula.model.Peliculas;
import crud.pelicula.repository.PeliculaRepository;

@Service
public class PeliculaService {
	@Autowired
	PeliculaRepository peliculaDao;
	
	public List<Peliculas> getAllPeliculas(){
		return this.peliculaDao.findAll();
	}

	public Peliculas addPelicula(Peliculas peliculas) {
		return this.peliculaDao.save(peliculas);
	}
	
	public void deleteById(Integer id) {
		this.peliculaDao.deleteById(id);
	}
	
	public Peliculas getPelicula(int id) {
		Optional<Peliculas> obj = this.peliculaDao.findById(id);
		if(obj.isPresent()){
			return obj.get();
		}
		return null;
		
	}
	
	
	
	
}
