package com.greenfoxacademy.workshopweek09day01.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.workshopweek09day01.domain.ArrayHandling;
import com.greenfoxacademy.workshopweek09day01.domain.Error;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ArrayService {
  public ResponseEntity<?> handlingArray(String allParams) {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      ArrayHandling arrayHandling = objectMapper.readValue(allParams, ArrayHandling.class);
      if (arrayHandling.getWhat().equals("sum") || arrayHandling.getWhat().equals("multiply")) {
        return ResponseEntity.ok().body(arrayHandling.getResult());
      } else if (arrayHandling.getWhat().equals("double")) {
        return ResponseEntity.ok().body(arrayHandling.getResultArray());
      }
    } catch (JsonProcessingException e) {
      return ResponseEntity.ok().body(new Error("Please provide what to do with the numbers!"));
    }
    return ResponseEntity.ok().body(new Error("Please provide what to do with the numbers!"));
  }
}
