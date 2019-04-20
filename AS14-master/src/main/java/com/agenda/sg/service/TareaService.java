package com.agenda.sg.service;

import java.util.List;
import com.agenda.sg.entity.Tarea;

public interface TareaService {
	
	public List<Tarea> getAll();
	public Tarea getById(Long id);
	public Tarea save(Tarea tarea);
	public Tarea delete(Long id);


}
