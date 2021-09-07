package com.fitnesszone.productService.service;

import java.util.List;

import com.fitnesszone.productService.exception.ProgramAlreadyExistsException;
import com.fitnesszone.productService.exception.ProgramNotFoundException;
import com.fitnesszone.productService.model.Program;

public interface ProgramService {
Program addprogram(Program program) throws ProgramAlreadyExistsException;
Program updateprogram(Program program);
Program getprogramByCode(String programCode) throws ProgramNotFoundException;
List<Program> listProgramByDuration(int duration);
List<Program> listProgramByActive();
List<Program> listAllPrograms();
Boolean deleteProgram(String programCode);
}
