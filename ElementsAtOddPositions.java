/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elementsatoddpositions;

/**
 *
 * @author nayan
 */
public class ElementsAtOddPositions {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        
        System.out.println("Elements at odd positions: ");
        for(int i = 0; i < numbers.length; i++){
            if (i % 2 != 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
