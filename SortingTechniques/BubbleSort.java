/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrudul
 */
import java.util.*;

public class BubbleSort {
    
    public static void swap(int[] arr, int i, int j){
        
        if(i==j){
            return;
        }
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args){
        
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        
        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(arr[i] > arr[i+1])
                    swap(arr, i, i+1);
            }
        }
        
        for(int i = 0; i < arr.length; i++){
               System.out.println(arr[i]); 
        }
    }
    
}
