package com.pankaj.springbootcrudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.pankaj.springbootcrudoperation.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer> {

}
