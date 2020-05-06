package com.greenfoxacademy.workshopweek09day01.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.workshopweek09day01.domain.Error;
import com.greenfoxacademy.workshopweek09day01.domain.SithText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SithService {
  public ResponseEntity<?> responseSith(String allParams) {
    ObjectMapper objectMapper = new ObjectMapper();
    try {
      String text = objectMapper.readTree(allParams).get("text").asText();
      List<String> sentences = Arrays.asList(text.split("\\. "));
      String[] randomThings = {"Arrgh. ", "Uhmm. ", "Err..err.err. ", "Hmmm. ", "Oooh. ", "Khmm.. khmm. "};
      StringBuilder newSentences = new StringBuilder();
      for (String sentence : sentences) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i += 2) {
          if (i == 0 && words.length > 1) {
            words[i + 1] = words[i + 1].substring(0, 1).toUpperCase() + words[i + 1].substring(1);
            words[i] = words[i].toLowerCase();
          }
          if (words.length > i + 1) {
            String temp = "";
            temp = words[i];
            words[i] = words[i + 1];
            words[i + 1] = temp;
          }
        }
        for (int i = 0; i < words.length; i++) {
          newSentences.append(words[i]);
          if (i < words.length - 1) {
            newSentences.append(" ");
          } else {
            newSentences.append(". ");
            newSentences.append(randomThings[(int) (Math.random() * randomThings.length)]);
            if (Math.random() > 0.5) {
              newSentences.append(randomThings[(int) (Math.random() * randomThings.length)]);
            }
          }
        }
      }

      return ResponseEntity.ok().body(new SithText(newSentences.toString()));
    } catch (JsonProcessingException e) {
      return ResponseEntity.ok().body(new Error("Feed me some text you have to, " +
          "padawan young you are. Hmmm."));
    }
  }
}
