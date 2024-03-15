/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.duplicateelements;
import java.util.*;

/**
 *
 * @author nayan
 */
public class DuplicateElements {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,8,2,3,9};
        
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();
        
        for (int number : numbers){
            
            if (!uniqueElements.add(number)){
                duplicateElements.add(number);
            }
        }
        System.out.println("Duplicate elemnts in the array: ");
        for (int duplicate : duplicateElements){
            System.out.println(duplicate);
        }
    }
}
