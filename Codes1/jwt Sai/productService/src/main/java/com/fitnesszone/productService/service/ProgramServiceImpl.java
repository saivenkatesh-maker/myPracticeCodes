package com.fitnesszone.productService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitnesszone.productService.exception.ProgramAlreadyExistsException;
import com.fitnesszone.productService.exception.ProgramNotFoundException;
import com.fitnesszone.productService.model.Program;
import com.fitnesszone.productService.repository.programRepo;
@Service
public class ProgramServiceImpl implements ProgramService{
	private programRepo Programrepo;
    @Autowired
	public ProgramServiceImpl(programRepo programrepo) {
		super();
		Programrepo = programrepo;
	}

	@Override
	public Program addprogram(Program program) throws ProgramAlreadyExistsException {
		if(Programrepo.findById(program.getProgramCode()).isPresent()) {
			throw new ProgramAlreadyExistsException();
		}
		return Programrepo.save(program);
	}

	@Override
	public Program updateprogram(Program program) {
		Program prog = new Program();
		prog=Programrepo.findById(program.getProgramCode()).get();
		if(prog!=null) {
			prog.setProgramName(program.getProgramName());
		    prog.setDescription(program.getDescription());
			prog.setDurationInMonths(program.getDurationInMonths());
			prog.setPrice(program.getPrice());
			prog.setActive(program.isActive());
			
		}
		return Programrepo.save(prog);
		
	}

	@Override
	public Program getprogramByCode(String programCode) throws ProgramNotFoundException {
		Program prog=new Program();
		prog=Programrepo.findById(programCode).get();
		return prog;
	}

	@Override
	public List<Program> listProgramByDuration(int durationInMonths) {
		return Programrepo.findBydurationInMonths(durationInMonths);
	}

	@Override
	public List<Program> listAllPrograms() {
		
		return Programrepo.findAll();
	}

	@Override
	public Boolean deleteProgram(String programCode) {
		
		 Programrepo.deleteById(programCode);
		 return true;
	}

	@Override
	public List<Program> listProgramByActive() {
		List<Program> outlist=Programrepo.findByActiveTrue();
		return outlist;
	}

}
