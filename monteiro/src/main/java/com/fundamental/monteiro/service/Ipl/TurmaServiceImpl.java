/* monteiro */
package com.fundamental.monteiro.service.Ipl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundamental.monteiro.entity.Turma;
import com.fundamental.monteiro.repository.TurmaRepository;
import com.fundamental.monteiro.service.TurmaService;

@Service
public class TurmaServiceImpl implements TurmaService {

	@Autowired
	private TurmaRepository turmaRepository;

	@Override
	public List<Turma> getAll() {
		
		List<Turma> turmas = (List<Turma>)turmaRepository.findAll();
		return turmas;
	}

	@Override
	public Turma getById(int id) {
		
		return turmaRepository.findById(id).orElse(null);
	}

	@Override
	public Turma insertOrUpdate(Turma turma) {
		
		return turmaRepository.save(turma);
	}

	@Override
	public void delete(int id) {
		turmaRepository.deleteById(id);
		
	}

}