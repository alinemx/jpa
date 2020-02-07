/* monteiro */
package com.fundamental.monteiro.service.Ipl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fundamental.monteiro.entity.Turno;
import com.fundamental.monteiro.repository.TurnoRepository;
import com.fundamental.monteiro.service.TurnoService;

@Service
public class TurnoServiceImpl implements TurnoService {
	
	@Autowired
	private TurnoRepository turnoRepository;

	@Override
	public List<Turno> getAll() {
		
		List<Turno> turnos= (List<Turno>)turnoRepository.findAll();
		return turnos;
	}

	@Override
	public Turno getById(int id) {
		
		return turnoRepository.findById(id).orElse(null);
	}

	@Override
	public Turno insertOrUpdate(Turno turno) {
		
		return turnoRepository.save(turno);
	}

	@Override
	public void delete(int id) {
		turnoRepository.deleteById(id);
		
	}
	
	


}