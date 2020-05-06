package com.greenfoxacademy.workshopweek09day01.services;

import com.greenfoxacademy.workshopweek09day01.domain.Log;
import com.greenfoxacademy.workshopweek09day01.repositories.LogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService{
  private LogRepository logRepository;

  @Autowired
  public LogServiceImpl(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void addLog(Log log) {
    logRepository.save(log);
  }

  @Override
  public List<Log> getAllLogs() {
    List<Log> logList = new ArrayList<>();
    logRepository.findAll().forEach(log -> logList.add(log));
    return logList;
  }
}
