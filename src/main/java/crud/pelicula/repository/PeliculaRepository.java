package crud.pelicula.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import crud.pelicula.model.Peliculas;

@Repository
public interface PeliculaRepository extends JpaRepository<Peliculas, Integer> {

}
