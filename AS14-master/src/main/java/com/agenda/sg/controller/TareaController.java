package com.agenda.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agenda.sg.entity.Tarea;
import com.agenda.sg.repository.TareaRepository;


@RestController
@RequestMapping("/tarea")
public class TareaController {
	
	@Autowired
	private TareaRepository tareaRepository;

	@GetMapping
	public List<Tarea> getall(){
		return this.tareaRepository.findAll();
	}
	
	@PostMapping
	public Tarea save(@RequestBody Tarea c) {
		return this.tareaRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Tarea getByid(@PathVariable("id") Long Id) {
		return this.tareaRepository.findById(Id).orElse(null);
}
	
	
	
	

}
