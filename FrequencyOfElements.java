/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frequencyofelements;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author nayan
 */
public class FrequencyOfElements {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,2,3};
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : numbers){
            if (frequencyMap.containsKey(num)){
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }
        
        System.out.println("Frequency of each element: ");
        for(Map.Entry<Integer, Integer>entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times."); 
        }
        
    }
}
