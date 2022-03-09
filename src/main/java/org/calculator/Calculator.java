package org.calculator;

public class Calculator {

    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else{
            String delimiter =",";
            delimiter +="|\n";
            String[] nums = toStringArray(numbers,delimiter);
            return calculateTotal(nums);
        }
    }

    /**
     *
     * @param number:string number
     * returns an integer
     */
    public static int toInt(String number){
        return Integer.parseInt(number);
    }
    /**
     *
     * @param numbers:Input String of numbers
     * @param delimiter:delimiter to split the numbers String
     * returns string array of numbers split at delimiter provided
     */
    public static String[] toStringArray(String numbers,String delimiter){
        return numbers.split(delimiter);
    }


    /**
     *
     * @param numbers:String array of input numbers
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
