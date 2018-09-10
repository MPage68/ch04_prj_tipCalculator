package ch04_prj_tipCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Tip Calculator");
		Scanner sc = new Scanner(System.in);
		// variables
		String choice = "y";
		BigDecimal fifteenPercent = new BigDecimal("0.15");
		BigDecimal twentyPercent = new BigDecimal("0.2");
		BigDecimal twentyFivePercent = new BigDecimal("0.25");
		BigDecimal costOfMeal = new BigDecimal(0.0);
		String totalDisplay = "";
		String tipDisplay = "";
		BigDecimal tip = new BigDecimal(0.0);
		BigDecimal total = new BigDecimal(0.0);
		// while loop
		while (!choice.equalsIgnoreCase("n")) {
			System.out.println("Cost of meal:\t");
			costOfMeal = sc.nextBigDecimal();
			//logic 15%
			tip = costOfMeal.multiply(fifteenPercent);
			tip = tip.setScale(2, RoundingMode.HALF_UP);
			total = costOfMeal.add(tip);
			totalDisplay = NumberFormat.getCurrencyInstance().format(total);
			tipDisplay = NumberFormat.getCurrencyInstance().format(tip);
			System.out.println("15%\n" + "Tip amount:\t" + tipDisplay + "\n" + "Total amount:\t" + totalDisplay);
			//20%
			tip = costOfMeal.multiply(twentyPercent);
			tip = tip.setScale(2, RoundingMode.HALF_UP);
			total = costOfMeal.add(tip);
			totalDisplay = NumberFormat.getCurrencyInstance().format(total);
			tipDisplay = NumberFormat.getCurrencyInstance().format(tip);
			System.out.println("20%\n" + "Tip amount:\t" + tipDisplay + "\n" + "Total amount:\t" + totalDisplay);
			//25%
			tip = costOfMeal.multiply(twentyFivePercent);
			tip = tip.setScale(2, RoundingMode.HALF_UP);
			total = costOfMeal.add(tip);
			totalDisplay = NumberFormat.getCurrencyInstance().format(total);
			tipDisplay = NumberFormat.getCurrencyInstance().format(tip);
			System.out.println("25%\n" + "Tip amount:\t" + tipDisplay + "\n" + "Total amount:\t" + totalDisplay);

			System.out.print("Continue:\t(y/n)");
			choice = sc.next();

		}
		System.out.println("Goodbye");
		sc.close();

	}
}
