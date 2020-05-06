package com.greenfoxacademy.workshopweek09day01.repositories;

import com.greenfoxacademy.workshopweek09day01.domain.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
