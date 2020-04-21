package com.greenfoxacademy.exercises.controllers;

import com.greenfoxacademy.exercises.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
  List<BankAccount> bankAccounts = new ArrayList<>();

  public MainController() {
    bankAccounts.add(new BankAccount("Scar", 1000, "lion", false, false));
    bankAccounts.add(new BankAccount("Mufasa", 2000, "lion", true, true));
    bankAccounts.add(new BankAccount("Zazu", 50, "hornbill", false, true));
    bankAccounts.add(new BankAccount("Rafiki", 10000, "mandrill", false, true));
    bankAccounts.add(new BankAccount("Timon", 1000, "meerkat", false, true));
  }

  @GetMapping(path = "/show")
  public String show(Model model) {
    BankAccount myBankAccount = new BankAccount("Simba", 2000, "lion", false, true);
    model.addAttribute("myBankAccount", myBankAccount);
    return "show";
  }

  @GetMapping(path = "/HTMLception")
  public String renderHtmlception(Model model) {
    String hTMLception = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("HTMLception", hTMLception);
    return "HTMLception";
  }

  @GetMapping(path = "/FillingmultipleAccounts")
  public String renderFillingMultipleAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    model.addAttribute("emptyBankAccount", new BankAccount("",0,"",false,false));
    return "FillingMultipleAccounts";
  }

  @PostMapping(path = "/addmoney")
  public String addMoney(@RequestParam int raise) {
    int raising = 10;
    if (bankAccounts.get(raise).isKing()) {
      raising = 100;
    }
    bankAccounts.get(raise).setBalance(bankAccounts.get(raise).getBalance() + raising);
    return "redirect:/FillingmultipleAccounts";
  }

  @PostMapping(path = "/addaccount")
  public String addAccount(@ModelAttribute BankAccount bankAccount){
    bankAccounts.add(bankAccount);
    return "redirect:/FillingmultipleAccounts";
  }
}
