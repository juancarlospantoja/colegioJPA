package com.juancarlospantoja.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.juancarlospantoja.Entity.Curso;
import com.juancarlospantoja.services.CursoService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("curso")
public class CursoController {
	@Autowired
	CursoService cursoService;
	
	@GetMapping(path = "/{prof}/{curso}")
	public List<Map<String,Object>> getCurso(@PathVariable("prof") int prof,@PathVariable("curso") int curso){
		return this.cursoService.getCurso(prof,curso);
	}
	
	
	@GetMapping
	public ArrayList<Curso> getCurso() {
		return (ArrayList<Curso>) this.cursoService.getCurso();
	}
	
	@PostMapping
	public Curso addCurso(@RequestBody Curso curso) {
		return cursoService.addCurso(curso);
	} 	
}
