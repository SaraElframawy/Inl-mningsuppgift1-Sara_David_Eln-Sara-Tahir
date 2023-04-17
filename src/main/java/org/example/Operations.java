package org.example;

public class Operations {
//@Step("add number1 and number2")
    public int add (int number1, int number2){
        return  number1+number2;
    }
    //@Step("subtract {number1} and {number2}")
    public int sub (int number1,int number2){
        return number1-number2;
    }
    //@Step("multi {number1} and {number2}")
    public int multi(int number1, int number2){
        return number1*number2;
    }

    //@Step("divide {number1} and {number2}")
    public int divide(int number1, int number2){
        return number1/number2;


    }

}


