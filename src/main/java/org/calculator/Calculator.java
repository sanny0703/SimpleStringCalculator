package org.calculator;

public class Calculator {

    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else{
            String[] nums = numbers.split(",");
            return calculateTotal(nums);
        }
    }

    /**
     *
     * Function to get integer value of the string
     * returns an integer
     */
    public static int toInt(String number){
        return Integer.parseInt(number);
    }



    /**
     *
     * @param numbers
     * returns the total sum of numbers in the array
     */
    public static int calculateTotal(String[] numbers){
        int total = 0;
        for(String number:numbers){
            total+=toInt(number);
        }
        return total;
    }
}
