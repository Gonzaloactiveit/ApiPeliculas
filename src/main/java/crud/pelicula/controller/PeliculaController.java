package crud.pelicula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import crud.pelicula.model.Peliculas;
import crud.pelicula.service.PeliculaService;



@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
	
	@Autowired
	PeliculaService peliculaService;
	
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Peliculas> getAllPeliculas(){
		return peliculaService.getAllPeliculas();
	}
	
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public Peliculas getPelicula(@PathVariable Integer id) {
		return peliculaService.getPelicula(id);
	}
	
	@RequestMapping(value = "/addPelicula", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody()
	
	public Peliculas addPelicula(@RequestBody Peliculas peliculas) {
		return this.peliculaService.addPelicula(peliculas);
		
	}
	
	@GetMapping("/delete/{id}")
	 public String delete(@PathVariable Integer id, Model model) {
	  peliculaService.deleteById(id);
	 
	  return "redirect:/";
	 }
	
	
}
	