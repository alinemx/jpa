/* monteiro */
package com.fundamental.monteiro.service;

import java.util.List;

import com.fundamental.monteiro.entity.Aluno;

public interface AlunoService {
	
	
	List<Aluno> getAll();
	
	Aluno getById(int id);
	Aluno insertOrUpdate(Aluno aluno);
	
	void delete(int id);
	
	
	
	
	
	
	

}
