package org.calculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Calculator {

    public static int add(String numbers){
        if(numbers.equals("")){
            return 0;
        }
        else{
            Pattern p = Pattern.compile("//(.*)\n(.*)");
            Matcher m = p.matcher(numbers);
            String delimiter;
            // Checking whether delimiter is specified at the start of the numbers String
            if(m.find()){
                // to take care of delimiter whose length is greater than 1
                delimiter = numbers.substring(2,2+m.group(1).length()) ;
                // to get rid of the delimiter specification part of the numbers String
                numbers = numbers.substring(2+m.group(1).length()+1);
            }
            else{
                delimiter = ",";
            }
            delimiter += "|\n";
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
