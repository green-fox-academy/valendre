package com.greenfoxacademy.workshop;

import com.greenfoxacademy.workshop.coloring.services.MyColor;
import com.greenfoxacademy.workshop.hellodiproject.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkshopApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  WorkshopApplication(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }


  public static void main(String[] args) {
    SpringApplication.run(WorkshopApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }

}
