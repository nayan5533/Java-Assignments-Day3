/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.largestelementinarray;

/**
 *
 * @author nayan
 */
public class LargestElementInArray {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        
        int largest = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] > largest){
               largest = numbers[i]; 
            }
        }
        System.out.println("The largest element in the array is: " + largest);
    }
}
