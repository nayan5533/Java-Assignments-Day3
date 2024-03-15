/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secondlargestnumber;

import java.util.Arrays;

/**
 *
 * @author nayan
 */
public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {5,2,9,1,7,3};
        
        Arrays.sort(numbers);
        
        int secondLargest = numbers[numbers.length - 2];
        
        System.out.println("Second largest number in array: " + secondLargest);
    }
}
