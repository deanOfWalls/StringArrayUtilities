package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO

    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        List<String> arrayList = Arrays.asList(array);
        return arrayList.contains(arrayList.get(arrayList.size() - 2));

    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        Collections.reverse(Arrays.asList(array)); //reverses the String[] as an ArrayList
        String[] reversedArr = Arrays.asList(array).toArray(new String[array.length]); //takes the reversed array list and assigns it to a String[] reversedArr
       // return Arrays.toString(reversedArr); //return the reversedArr as a String[]
        return reversedArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {



        //assigns array in reversed order to String[]reversedArr
        String[] reversedArr = Arrays.copyOf(array, array.length);

       //reverses the String[]array as an ArrayList
        Collections.reverse(Arrays.asList(array));

        //return boolean that shows if reversedArr is equal to array
        //return reversedArr.equals(array);
        return Arrays.equals(reversedArr, array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                "o","p","q","r","s","t","u","v","w","x","y","z"}; //string for alphabet

        boolean[] checker = new boolean[26]; //boolean to check if character is found

        for (String s: alphabet) { //temporarily stores current element of alphabet in s
              {
            char c = s.charAt(0);
           // if('a') <= c && c <= 'z') {
                checker[c-'a'] =true;
            }
            
        }

        return false;
    }
//    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
              int arrayCounter = 0;
        for (int i = 0; i <= array.length-1; i++) {
            if(Arrays.asList(array[i]).contains(value)){
                arrayCounter++;
            }
        }
        return arrayCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String>arrayList = new ArrayList<>(Arrays.asList(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i]==valueToRemove){
                arrayList .remove(arrayList[i]);
            }

        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        return null;
    }


}
