package com.greenfoxacademy.workshop.greenfoxclassapp.services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Primary
public class StudentFile implements StudentInterface{

  private String filename;

    public StudentFile() {
      filename = "./text/names.txt";
    }

    @Override
    public int hashCode() {
      return super.hashCode();
    }

    @Override
    public List<String> findAll() {
      try{
        return Files.readAllLines(Paths.get(filename));
      } catch (IOException e) {
        e.printStackTrace();
        return new ArrayList<>();
      }
    }

    @Override
    public void save(String student) {
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.filename,
            true));
        writer.newLine();   //Add new line
        writer.write(student);
        writer.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    @Override
    public int count() {
      return this.findAll().size();
    }

    @Override
    public String check(String name) {
      if (this.findAll().contains(name)) {
        return name + " is already in the list.";
      }
      return name + "is not in the list.";
    }
}
