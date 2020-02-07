/* monteiro */
package com.fundamental.monteiro.service;

import java.util.List;

import com.fundamental.monteiro.entity.Turma;

public interface TurmaService {
	
		
		List<Turma> getAll();
		
		Turma getById (int id);
		
		Turma insertOrUpdate(Turma turma);
		
		void delete (int id);

}
