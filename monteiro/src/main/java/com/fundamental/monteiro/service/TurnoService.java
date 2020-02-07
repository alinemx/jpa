/* monteiro */
package com.fundamental.monteiro.service;

import java.util.List;



import com.fundamental.monteiro.entity.Turno;


public interface TurnoService {
	
	List<Turno> getAll();
	
	Turno getById(int id); 
	
	Turno insertOrUpdate(Turno turno);
	
	void delete(int id);
	
	
	
	

}
