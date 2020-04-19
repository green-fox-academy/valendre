package com.greenfoxacademy.webshop;

import com.greenfoxacademy.webshop.models.Shop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebshopApplication {

	private static float czkPerEur = (float)0.037;
	private static Shop myShop = new Shop();
	private static String paragraph = "";
	private static String currency = "Kč";
	private static String currentController="/";
	private static String lastSubmit="above";
	private static String lastPrice="0";

	public static void main(String[] args) {
		SpringApplication.run(WebshopApplication.class, args);
	}

	public static float getCzkPerEur() {
		return czkPerEur;
	}

	public static Shop getMyShop() {
		return myShop;
	}

	public static String getParagraph() {
		return paragraph;
	}

	public static void setParagraph(String paragraph) {
		WebshopApplication.paragraph = paragraph;
	}

	public static String getCurrency() {
		return currency;
	}

	public static void setCurrency(String currency) {
		WebshopApplication.currency = currency;
	}

	public static String getCurrentController() {
		return currentController;
	}

	public static void setCurrentController(String currentController) {
		WebshopApplication.currentController = currentController;
	}

	public static String getLastSubmit() {
		return lastSubmit;
	}

	public static void setLastSubmit(String lastSubmit) {
		WebshopApplication.lastSubmit = lastSubmit;
	}

	public static String getLastPrice() {
		return lastPrice;
	}

	public static void setLastPrice(String lastPrice) {
		WebshopApplication.lastPrice = lastPrice;
	}
}
