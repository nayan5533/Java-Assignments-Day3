/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversearray;

/**
 *
 * @author nayan
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        
        System.out.println("Elements of the array in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }
    }
}
