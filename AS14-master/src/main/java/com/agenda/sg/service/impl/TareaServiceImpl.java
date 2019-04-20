package com.agenda.sg.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.agenda.sg.entity.Tarea;
import com.agenda.sg.repository.TareaRepository;
import com.agenda.sg.service.TareaService;

public class TareaServiceImpl implements TareaService {

	@Autowired
	private TareaRepository tareaRepository;
	
	@Override
	public List<Tarea> getAll() {
		return this.tareaRepository.findAll();
	}

	@Override
	public Tarea getById(Long id) {
		return this.tareaRepository.findById(id).orElse(null);
	}
	@Override
	public Tarea save(Tarea tarea) {
		return this.tareaRepository.save(tarea);
	}

	@Override
	public Tarea delete(Long id) {
		Tarea tarea = this.getById(id);
		if (tarea != null) {
			this.tareaRepository.delete(tarea);
		}
		return tarea;
}

}
