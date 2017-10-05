package com.damonkhan;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class Main {

  public static void main(String[] args) {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    for (int i = 2; i <= 8; i++) {
      System.out.println("$10,000 at " + i + "% interest rate = "
              + formatter.format(calculateInterest(10000, i)));
    }

    System.out.println("**************************");

    for (int i = 8; i >=2; i--) {
      System.out.println("$10,000 at " + i + "% interest rate = "
              + formatter.format(calculateInterest(10000, i)));
    }

    int numPrimes = 0;
    int n = 0;

    for (;;) {
      if (isPrime(n)) {
        System.out.println(n + " is prime");
        numPrimes++;

        if (numPrimes == 3) {
          break;
        }
      }

      n++;
    }

  }

  public static boolean isPrime(int n) {
    if (n == 1) {
      return false;
    }

    for (int i = 2; i <= n/2; i++) {
      if (n % 2 == 0) {
        return false;
      }
    }

    return true;

  }

  public static double calculateInterest(double amount, double interest) {

    return (amount * (interest / 100));

  }
}
