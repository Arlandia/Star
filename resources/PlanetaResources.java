package com.senac.starwars.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.starwars.dominio.Planeta;
import com.senac.starwars.repositorio.PlanetaRepositorio;

@RestController
@RequestMapping(value="/api")
public class PlanetaResources {
	
	@Autowired
	PlanetaRepositorio planetaRepositorio;
	
	@GetMapping("/planeta")// lista todos os planetas 
	public List<Planeta> listaPlanetas(){
		return planetaRepositorio.findAll();
		
	}
	
	@GetMapping("/planeta/{id}")// lista o planeta especifico pelo id
	public Optional<Planeta> listaPlanetaUnico(@PathVariable(value="id")Integer id){
		return planetaRepositorio.findById(id);
		
	}
	
	@PostMapping("/planeta")
	public Planeta salvarPlaneta(@RequestBody Planeta planeta){
		return planetaRepositorio.save(planeta);
		
	}
	@DeleteMapping("/planeta")
	public void deletaPlaneta(@RequestBody Planeta planeta){
		planetaRepositorio.delete(planeta);
		
	}
	
	

}
