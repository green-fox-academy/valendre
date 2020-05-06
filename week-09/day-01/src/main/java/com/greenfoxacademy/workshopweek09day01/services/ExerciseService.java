package com.greenfoxacademy.workshopweek09day01.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.workshopweek09day01.domain.AppendA;
import com.greenfoxacademy.workshopweek09day01.domain.DoUntil;
import com.greenfoxacademy.workshopweek09day01.domain.Doubling;
import com.greenfoxacademy.workshopweek09day01.domain.Error;
import com.greenfoxacademy.workshopweek09day01.domain.Greeter;
import com.greenfoxacademy.workshopweek09day01.domain.Until;
import java.util.Map;
import java.util.Optional;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

  public ResponseEntity<?> doubling(Optional<Integer> input) {
    if (input.isPresent()) {
      Doubling doubling = new Doubling(input.get());
      return ResponseEntity.ok().body(doubling);
    } else {
      return ResponseEntity.ok().body(new Error("Please provide an input!"));
    }
  }

  public ResponseEntity<?> greet(Optional<String> name, Optional<String> title) {
    if (name.isPresent()) {
      if (title.isPresent()) {
        return ResponseEntity.ok().body(new Greeter(name.get(), title.get()));
      } else {
        return ResponseEntity.status(400).body(new Error("Please provide a title!"));
      }
    }
    return ResponseEntity.status(400).body(new Error("Please provide a name and a title!"));
  }

  public ResponseEntity<?> appendA(Optional<String> input) {
    if (input.isPresent()) {
      return ResponseEntity.ok().body(new AppendA(input.get()));
    } else {
      return ResponseEntity.status(404).body(new Error("Not Found"));
    }
  }

  public ResponseEntity<?> doUntil(String allParams, Optional<String> operator) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    Until until = objectMapper.readValue(allParams, Until.class);
    if (operator.isPresent()) {
      return ResponseEntity.ok().body(new DoUntil(operator.get(), until.getUntil()));
    } else {
      return ResponseEntity.status(501).body(new Error("Bad request"));
    }
  }
}
