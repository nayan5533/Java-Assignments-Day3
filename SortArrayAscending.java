/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortarrayascending;
import java.util.Arrays;

/**
 *
 * @author nayan
 */
public class SortArrayAscending {

    public static void main(String[] args) {
        int[] numbers = {5,3,2,9,1,7};
        
        Arrays.sort(numbers);
        
        System.out.println("Sorted array in ascending order: ");
        for (int number : numbers){
            System.out.println(number);
        }
    }
}
