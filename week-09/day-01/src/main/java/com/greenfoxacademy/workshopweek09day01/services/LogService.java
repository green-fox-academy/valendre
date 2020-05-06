package com.greenfoxacademy.workshopweek09day01.services;

import com.greenfoxacademy.workshopweek09day01.domain.Log;
import java.util.List;

public interface LogService {
  public void addLog(Log log);
  public List<Log> getAllLogs();
}
