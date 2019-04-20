package com.agenda.sg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.sg.entity.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long>{

}
