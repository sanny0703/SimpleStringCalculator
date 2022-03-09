package org.calculator;

public class Calculator {

    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else{
            String delimiter =",";
            String[] nums = toStringArray(numbers,delimiter);
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
     * @param numbers:Input String of numbers
     * @param delimiter
     * returns string array of numbers split at delimiter provided
     */
    public static String[] toStringArray(String numbers,String delimiter){
        return numbers.split(delimiter);
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
