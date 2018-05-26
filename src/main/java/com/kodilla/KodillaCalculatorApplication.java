package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.prefs.Preferences;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCalculatorApplication.class, args);
        Calculator calculator = new Calculator();

        int a = 5;
        int b = 10;
        int calculationMark = 1;
        /*
        1 - addition
        2 - subtraction
         */


        if(calculationMark==1){
            System.out.println(calculator.addition(a,b));
        }
        if(calculationMark==2){
            System.out.println(calculator.subtraction(a,b));
        }

        if((calculationMark!=1)&&(calculationMark!=2)){
            System.out.println("Incorrect data!");
        }

    }
}
